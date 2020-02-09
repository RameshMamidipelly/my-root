package com.site.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentModel {

	private String sname;
	private int sid;

	
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "StudentModel [sname=" + sname + ", sid=" + sid + "]";
	}
	public StudentModel(int sid,String sname) {
		super();
		this.sname = sname;
		this.sid = sid;
	}
	
}
