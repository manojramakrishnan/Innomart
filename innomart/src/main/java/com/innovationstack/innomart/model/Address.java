package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Integer id;
	@Column(name="user_id",nullable=false)
	private Integer userId;
	@Column(name="address",nullable=false)
	private String address;
	@Column(name="phone",nullable=false)
	private String phone;
	@Column(name="fax",nullable=false)
	private String fax;
	@Column(name="city",nullable=false)
	private String city;
	@Column(name="country",nullable=false)
	private String country;
	
	public Address() {
		
	}
	public Address(Integer id, Integer userId, String address, String phone, String fax, String city,
			String country) {
		super();
		this.id = id;
		this.userId = userId;
		this.address = address;
		this.phone = phone;
		this.fax = fax;
		this.city = city;
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", userId=" + userId + ", address=" + address + ", phone=" + phone
				+ ", fax=" + fax + ", city=" + city + ", country=" + country + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	


}
