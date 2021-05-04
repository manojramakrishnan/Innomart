package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Theme {

	@Override
	public String toString() {
		return "Theme [themeId=" + themeId + ", name=" + name + ", version=" + version + ", thumbnail=" + thumbnail
				+ ", sourcePath=" + sourcePath + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer themeId;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="version",nullable=false)
	private String version;
	@Column(name="thumbnail",nullable=false)
	private String thumbnail;
	@Column(name="sourcePath",nullable=false)
	private String sourcePath;
	
	public Theme() {
		
	}

	public Integer getThemeId() {
		return themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getSourcePath() {
		return sourcePath;
	}

	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

	public Theme(Integer themeId, String name, String version, String thumbnail, String sourcePath) {
		super();
		this.themeId = themeId;
		this.name = name;
		this.version = version;
		this.thumbnail = thumbnail;
		this.sourcePath = sourcePath;
	}
}
