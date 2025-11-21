package com.junitexample.junitexample;

import java.util.function.IntPredicate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tbl_hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hid;
	private String hname;
	private String haddress;
	private String hitem;
	public int getHid() {
		return hid;
	}
	
	public Hotel(String hname, String haddress, String hitem) {
		this.hname = hname;
		this.haddress = haddress;
		this.hitem = hitem;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHaddress() {
		return haddress;
	}
	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}
	public String getHitem() {
		return hitem;
	}
	public void setHitem(String hitem) {
		this.hitem = hitem;
	}

	public Hotel() {
		
		// TODO Auto-generated constructor stub
	}

	public IntPredicate size() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
