package com.innovationstack.innomart.auth.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.api.response.model.util.RestStatus;
import com.innovationstack.innomart.auth.AuthUser;
import com.innovationstack.innomart.exception.ApplicationException;
import com.innovationstack.innomart.model.Users;
import com.innovationstack.innomart.model.UsersTokens;
import com.innovationstack.innomart.repositories.UserRepository;
import com.innovationstack.innomart.repositories.UserTokenRepository;
import com.innovationstack.innomart.service.AbstractBaseService;
import com.innovationstack.innomart.util.AuthUserFactory;
import com.innovationstack.innomart.util.Constant;
import com.innovationstack.innomart.util.DateUtil;
import com.innovationstack.innomart.util.UniqueID;

@Component("authService")
public class AuthServiceImpl extends AbstractBaseService implements AuthService {
	
	@Autowired
    UserRepository userRepository;
    
    @Autowired
    private UserTokenRepository userTokenRepository;
    
    @Autowired
    AuthUserFactory authUserFactory;
	
	
	
	@Override
    public UsersTokens createUserToken (Users userLogin, boolean keepMeLogin){
        try {
            UsersTokens userToken = new UsersTokens();
            userToken.setToken(UniqueID.getUUID());
            userToken.setCompanyId(userLogin.getCompanyId());
            userToken.setUserId(userLogin.getId());
            Date currentDate = new Date();
            userToken.setLoginDate(DateUtil.convertToUTC(currentDate));
            Date expirationDate = keepMeLogin ? new Date(currentDate.getTime() + Constant.DEFAULT_REMEMBER_LOGIN_MILISECONDS) : new Date(currentDate.getTime() + Constant.DEFAULT_SESSION_TIME_OUT);
            userToken.setExpirationDate(DateUtil.convertToUTC(expirationDate));
            AuthUser authUser = authUserFactory.createAuthUser(userLogin);
            // Set authUser to session data...
            userToken.setSessionData(gson.toJson(authUser));
            userTokenRepository.save(userToken);
            return userToken;
        } catch (Exception e) {
            LOGGER.error("Error create User token ", e);
            throw new ApplicationException(RestStatus.SQL_ERROR);
        }
    }



	@Override
	public UsersTokens getUserTokenById(String token) {
		// TODO Auto-generated method stub
		return null;
	}

}
