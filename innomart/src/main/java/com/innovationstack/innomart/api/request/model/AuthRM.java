package com.innovationstack.innomart.api.request.model;

public class AuthRM {
	
	public String username;
    public String password;
    public boolean keepMeLogin;
    
    public AuthRM() {}

	public AuthRM(String username, String password, boolean keepMeLogin) {
		super();
		this.username = username;
		this.password = password;
		this.keepMeLogin = keepMeLogin;
	}

	@Override
	public String toString() {
		return "AuthRM [username=" + username + ", password=" + password + ", keepMeLogin=" + keepMeLogin + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isKeepMeLogin() {
		return keepMeLogin;
	}

	public void setKeepMeLogin(boolean keepMeLogin) {
		this.keepMeLogin = keepMeLogin;
	}
    
    

}
