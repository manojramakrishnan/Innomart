package com.innovationstack.innomart.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Users {
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", companyId=" + companyId + ", groupId=" + groupId + ", roleId=" + roleId
				+ ", email=" + email + ", passwordHash=" + passwordHash + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", status=" + status + ", createDate=" + createDate
				+ ", company=" + company + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;
	@Column(name="company_id",nullable=false)
	private long companyId=0;
	@Column(name="groupid",nullable=false)
	private Integer groupId;
	@Column(name="roles_id",nullable=false)
	private Integer roleId;
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

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
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



	public Users(Integer id, Integer companyId, Integer groupId, Integer roleId, String email, String passwordHash,
			String firstName, String middleName, String lastName, Integer status, Date createDate, Companies company) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.groupId = groupId;
		this.roleId = roleId;
		this.email = email;
		this.passwordHash = passwordHash;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.status = status;
		this.createDate = createDate;
		this.company = company;
	}

}
