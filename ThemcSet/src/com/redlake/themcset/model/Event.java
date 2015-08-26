package com.redlake.themcset.model;



public class Event {

public String Event_Name;
public String Event_title;
public String Event_descr;
public String Event_date;
public String Event_addr1;
public String Event_addr2;
public double Latitude;
public double Longitude;

public String getEvent_date() {
	return Event_date;
}
public void setEvent_date(String event_date) {
	Event_date = event_date;
}
public String getEvent_addr1() {
	return Event_addr1;
}
public void setEvent_addr1(String event_addr1) {
	Event_addr1 = event_addr1;
}
public String getEvent_addr2() {
	return Event_addr2;
}
public void setEvent_addr2(String event_addr2) {
	Event_addr2 = event_addr2;
}
public String getClub_Name() {
	return this.Event_Name;
}
public void setEvent_Name(String event_Name) {
	this.Event_Name = event_Name;
}
public void setEvent_descr(String event_title) {
	Event_title = event_title;
}
public double getLatitude() {
	return Latitude;
}
public void setLatitude(double latitude) {
	this.Latitude = latitude;
}
public double getLongitude() {
	return Longitude;
}
public void setLongitude(double longitude) {
	this.Longitude = longitude;
}

public Event (String event_title, String event_date, String event_descr, String event_addr1 ,String event_addr2 , double latitude, double longitude ) {
	this.Event_Name = event_title;
	this.Event_descr = event_descr;
	this.Event_date = event_date;
	this.Event_addr1 = event_addr1;
	this.Event_addr2 = event_addr2;
	this.Latitude = latitude;
	this.Longitude = longitude;
	
}


}