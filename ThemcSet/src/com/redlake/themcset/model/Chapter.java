package com.redlake.themcset.model;

public class Chapter {

public String Club_Name;
public double Latitude;
public double Longitude;

public String getClub_Name() {
	return Club_Name;
}
public void setClub_Name(String club_Name) {
	Club_Name = club_Name;
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

public Chapter (String club_name, double latitude, double longitude ) {
	this.Club_Name = club_name;
	this.Latitude = latitude;
	this.Longitude = longitude;
	
}


}