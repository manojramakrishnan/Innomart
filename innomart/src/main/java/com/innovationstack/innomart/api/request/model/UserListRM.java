package com.innovationstack.innomart.api.request.model;

public class UserListRM {
	
	public String searchKey;
    public int sortCase;
    public Boolean ascSort;
    public int pageNumber;
    public int pageSize;
 
    public UserListRM () {
    	
    }

	public UserListRM(String searchKey, int sortCase, Boolean ascSort, int pageNumber, int pageSize) {
		super();
		this.searchKey = searchKey;
		this.sortCase = sortCase;
		this.ascSort = ascSort;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "UserListRM [searchKey=" + searchKey + ", sortCase=" + sortCase + ", ascSort=" + ascSort
				+ ", pageNumber=" + pageNumber + ", pageSize=" + pageSize + "]";
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public int getSortCase() {
		return sortCase;
	}

	public void setSortCase(int sortCase) {
		this.sortCase = sortCase;
	}

	public Boolean getAscSort() {
		return ascSort;
	}

	public void setAscSort(Boolean ascSort) {
		this.ascSort = ascSort;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
    
    
}
