package com.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {
	@Id
	@Column(name="pid")
   private int passenger_id;
   private String pname;
   private String startTime;
   private String endTime;
   private double ticketFair;
Passenger(int passenger_id, String pname, String startTime, String endTime, double ticketFair) {
	super();
	this.passenger_id = passenger_id;
	this.pname = pname;
	this.startTime = startTime;
	this.endTime = endTime;
	this.ticketFair = ticketFair;
}
Passenger() {
	super();
}
public int getPassenger_id() {
	return passenger_id;
}
public void setPassenger_id(int passenger_id) {
	this.passenger_id = passenger_id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
public String getEndTime() {
	return endTime;
}
public void setEndTime(String endTime) {
	this.endTime = endTime;
}
public double getTicketFair() {
	return ticketFair;
}
public void setTicketFair(double ticketFair) {
	this.ticketFair = ticketFair;
}
@Override
public String toString() {
	return "Passenger [passenger_id=" + passenger_id + ", pname=" + pname + ", startTime=" + startTime + ", endTime="
			+ endTime + ", ticketFair=" + ticketFair + "]";
}
   
}
