package com.curd.cpcwithapi10.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private String collage;
	private String location;
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
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", collage=" + collage + ", location=" + location + "]";
	}
	
	

}
