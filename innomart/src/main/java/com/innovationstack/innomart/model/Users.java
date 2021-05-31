package com.innovationstack.innomart.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Users {
	


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;
	@Override
	public String toString() {
		return "Users [id=" + id + ", companyId=" + companyId + ", groupId=" + groupId + ", email=" + email
				+ ", passwordHash=" + passwordHash + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", status=" + status + ", createDate=" + createDate + ", address="
				+ address + ", company=" + company + ", role=" + role + ", roles=" + roles + "]";
	}

	@Column(name="company_id",nullable=false)
	private long companyId=0;
	@Column(name="groupid",nullable=false)
	private Integer groupId;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="passwordhash",nullable=false)
	private String passwordHash;
	@Column(name="firstname",nullable=false)
	private String firstName;
	@Column(name="middlename",nullable=false)
	private String middleName;
	@Column(name="lastname",nullable=false)
	private String lastName;
	@Column(name="status",nullable=false)
	private Integer status;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createDate;
	@Transient
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@ManyToOne
	@JoinColumn
	private Companies company;
	
	public Companies getCompany() {
		return company;
	}

	public void setCompany(Companies company) {
		this.company = company;
	}

	public Users() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	
	

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	@ManyToOne
	@JoinColumn
	private Roles role;
	
	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name= "user_roles", joinColumns = @JoinColumn(name= "user_id"), inverseJoinColumns = @JoinColumn(name= "roles_id"))
	private Set<Roles> roles;

	public Users(Integer id, long companyId, Integer groupId, String email, String passwordHash, String firstName,
			String middleName, String lastName, Integer status, Date createDate, Address address, Companies company,
			Roles role, Set<Roles> roles) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.groupId = groupId;
		this.email = email;
		this.passwordHash = passwordHash;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.status = status;
		this.createDate = createDate;
		this.address = address;
		this.company = company;
		this.role = role;
		this.roles = roles;
	}
	
	
}
