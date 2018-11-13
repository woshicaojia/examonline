package com.example.demo.entity;// default package

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */
public class Teacher implements java.io.Serializable {

	// Fields

	private String sysid;
	private String teacherId;
	private String password;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** full constructor */
	public Teacher(String teacherId, String password) {
		this.teacherId = teacherId;
		this.password = password;
	}

	public String getSysid() {
		return this.sysid;
	}

	public void setSysid(String sysid) {
		this.sysid = sysid;
	}

	public String getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}