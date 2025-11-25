package com.crudwithoutapi.crudwithoutapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private String branch;
	private String collage;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", branch=" + branch + ", collage=" + collage + "]";
	}
	
	
}
