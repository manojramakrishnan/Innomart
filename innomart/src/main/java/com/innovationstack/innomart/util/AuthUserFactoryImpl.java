package com.innovationstack.innomart.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.auth.AuthUser;
import com.innovationstack.innomart.model.Users;
import com.innovationstack.innomart.repositories.RoleRepository;

@Service
public class AuthUserFactoryImpl implements AuthUserFactory{
	
    @Autowired
    RoleRepository roleRepository;
    
    @Override
    public AuthUser createAuthUser(Users user) {
        return new AuthUser(
                    user.getId(),
                    user.getEmail(),
                    user.getPasswordHash(),
                    getUserRoleString(user.getRole().getId()),
                    user.getFirstName(),
                    user.getLastName(),
                    user.getStatus() == Constant.STATUS.ACTIVE_STATUS.getValue()
            );
    }
    
    private String getUserRoleString (int roleId){
        try {
            return roleRepository.findRoleByRoleId(roleId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}