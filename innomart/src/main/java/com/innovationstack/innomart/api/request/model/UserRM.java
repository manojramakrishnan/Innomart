package com.innovationstack.innomart.api.request.model;

public class UserRM {
	
	private String userId;
	private String email;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phone;
	private String fax;
	private String address;
	private String city;
	private String country;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRM (){
		
	}
	public UserRM(String userId, String email, String firstName, String middleName, String lastName, String phone,
			String fax, String address, String city, String country,String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phone = phone;
		this.fax = fax;
		this.address = address;
		this.city = city;
		this.country = country;
		this.password= password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	
}
