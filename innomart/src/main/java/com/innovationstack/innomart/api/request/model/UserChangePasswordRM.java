package com.innovationstack.innomart.api.request.model;

public class UserChangePasswordRM {
	
	
	private int id;
	
	private String oldPassword;
	
	private String newPassword;

	public UserChangePasswordRM(int id, String oldPassword, String newPassword) {
		super();
		this.id = id;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
	}
	
	public UserChangePasswordRM() {}

	@Override
	public String toString() {
		return "UserChangePasswordRM [id=" + id + ", oldPassword=" + oldPassword + ", newPassword=" + newPassword + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	

}
