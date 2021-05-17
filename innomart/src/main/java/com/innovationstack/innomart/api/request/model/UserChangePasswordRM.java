package com.innovationstack.innomart.api.request.model;

public class UserChangePasswordRM {
	
	
	private String Id;
	private String OldPassword;
	private String NewPassword;
	public UserChangePasswordRM(String id, String oldPassword, String newPassword) {
		super();
		Id = id;
		OldPassword = oldPassword;
		NewPassword = newPassword;
	}
	@Override
	public String toString() {
		return "UserChangePasswordRM [Id=" + Id + ", OldPassword=" + OldPassword + ", NewPassword=" + NewPassword + "]";
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getOldPassword() {
		return OldPassword;
	}
	public void setOldPassword(String oldPassword) {
		OldPassword = oldPassword;
	}
	public String getNewPassword() {
		return NewPassword;
	}
	public void setNewPassword(String newPassword) {
		NewPassword = newPassword;
	}

}
