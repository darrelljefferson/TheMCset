package com.redlake.themcset.model;

public class Advertiser {

	public String Advertiser_Name;
	public String Address1;
	public String Address2;
	public String City;
	public String State;
	public int Zip;
	public String WebSite;
	public String Phone;
	public String Msg;
	
	public String getAdvertiser_Name() {
		return Advertiser_Name;
	}
	public void setAdvertiser_Name(String advertiser_Name) {
		Advertiser_Name = advertiser_Name;
	}
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZip() {
		return Zip;
	}
	public void setZip(int zip) {
		Zip = zip;
	}
	public String getWebSite() {
		return WebSite;
	}
	public void setWebSite(String webSite) {
		WebSite = webSite;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	
	
	public Advertiser (String advertiser_name, String address1, String address2, String city, String state, int zip, String website, String phone, String msg) {
		
		this.Advertiser_Name = advertiser_name;
		this.Address1 = address1;
		this.Address2 = address2;
		this.City = city;
		this.State = state;
		this.Zip = zip;
		this.WebSite = website;
		this.Phone = phone;
		this.Msg = msg;
		
	}
}
