package com.innovationstack.innomart.api.response.model;

import java.util.Date;

public class UserDetailRM {

	
	private int userId;
    private Long companyId;
    private int roleId;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date createDate;
    private String salt;
    private String address;
    private String phone;
    private String fax;
    private String city;
    private String country;

    public UserDetailRM() {
    	
    }

	public UserDetailRM(int userId, Long companyId, int roleId, String email, String firstName, String middleName,
			String lastName, Date createDate, String salt, String address, String phone, String fax, String city,
			String country) {
		super();
		this.userId = userId;
		this.companyId = companyId;
		this.roleId = roleId;
		this.email = email;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.createDate = createDate;
		this.salt = salt;
		this.address = address;
		this.phone = phone;
		this.fax = fax;
		this.city = city;
		this.country = country;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserDetailRM [userId=" + userId + ", companyId=" + companyId + ", roleId=" + roleId + ", email=" + email
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", salt="
				+ salt + ", address=" + address + ", phone=" + phone + ", fax=" + fax + ", city=" + city + ", country="
				+ country + "]";
	}


}

