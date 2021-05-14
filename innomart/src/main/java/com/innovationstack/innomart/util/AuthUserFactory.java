package com.innovationstack.innomart.util;

import com.innovationstack.innomart.auth.AuthUser;
import com.innovationstack.innomart.model.Users;

public interface AuthUserFactory {
	
	AuthUser createAuthUser (Users user);

}
