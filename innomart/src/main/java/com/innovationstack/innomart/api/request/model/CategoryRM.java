package com.innovationstack.innomart.api.request.model;

public class CategoryRM {

	private Integer categoryId;
	private Long companyId;
	private Integer parentId;
	private String appName;
	private String status;
	private String description;
	public CategoryRM(Integer categoryId, Long companyId, Integer parentId, String appName, String status,
			String description) {
		super();
		this.categoryId = categoryId;
		this.companyId = companyId;
		this.parentId = parentId;
		this.appName = appName;
		this.status = status;
		this.description = description;
	}
	@Override
	public String toString() {
		return "CategoryRM [categoryId=" + categoryId + ", companyId=" + companyId + ", parentId=" + parentId
				+ ", appName=" + appName + ", status=" + status + ", description=" + description + "]";
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	
}
