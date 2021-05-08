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
		return "Theme [id=" + id + ", themeName=" + themeName + ", version=" + version + ", thumbnail=" + thumbnail
				+ ", sourcePath=" + sourcePath + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "theme_id")
	private Integer id;
	@Column(name="themename",nullable=false)
	private String themeName;
	@Column(name="version",nullable=false)
	private String version;
	@Column(name="thumbnail",nullable=false)
	private String thumbnail;
	@Column(name="sourcepath",nullable=false)
	private String sourcePath;
	
	public Theme() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getThemeName() {
		return themeName;
	}

	public void setName(String themeName) {
		this.themeName = themeName;
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

	public Theme(Integer id, String themeName, String version, String thumbnail, String sourcePath) {
		super();
		this.id = id;
		this.themeName = themeName;
		this.version = version;
		this.thumbnail = thumbnail;
		this.sourcePath = sourcePath;
	}
}
