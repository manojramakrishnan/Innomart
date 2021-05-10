package com.innovationstack.innomart.api.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.innovationstack.innomart.api.response.model.util.ResponseUtil;
import com.innovationstack.innomart.configs.AppConfig;

public abstract class AbstractBaseController {
	
	@Autowired
    protected ResponseUtil responseUtil;
	
//	@Autowired
//	private CustomUserAuthService userDetailService;
//	
	@Autowired
	AppConfig appConfig;
	
//	public AuthUser getAuthUserFromSession(HttpServletRequest request) {
//        String authToken = request.getHeader(Constant.HEADER_TOKEN);
//        // try to load sessio
//        AuthUser user = userDetailService.loadUserByAccessToken(authToken);
//        return user;
//    }


}
