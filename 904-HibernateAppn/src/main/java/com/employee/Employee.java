package com.employee;

public class Employee {
	private int eid;
	private String ename;	
	private String  designation;
	private double salary;
	Employee(int eid, String ename, String designation, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
		this.salary = salary;
	}
	
	Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}
	
}
