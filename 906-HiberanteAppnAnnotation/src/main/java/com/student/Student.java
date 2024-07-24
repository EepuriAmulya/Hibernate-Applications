package com.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Std_table")
public class Student {
	@Id
	@GeneratedValue
@Column(name="Student_Id")
	private int sid;
@Column(name="Student_Name")	
	private  String sname;
	private String stdMarks;
	private String stdResult;
	Student(int sid, String sname, String stdMarks, String stdResult) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.stdMarks = stdMarks;
		this.stdResult = stdResult;
	}
	Student() {
		super();
	}
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
	public String getStdMarks() {
		return stdMarks;
	}
	public void setStdMarks(String stdMarks) {
		this.stdMarks = stdMarks;
	}
	public String getStdResult() {
		return stdResult;
	}
	public void setStdResult(String stdResult) {
		this.stdResult = stdResult;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", stdMarks=" + stdMarks + ", stdResult=" + stdResult + "]";
	}
	
	


}
