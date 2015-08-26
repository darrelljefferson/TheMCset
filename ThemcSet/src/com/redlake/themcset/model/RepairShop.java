package com.redlake.themcset.model;

public class RepairShop {

	public String Shop_Name;
	public String Shop_Addr1;
	public String Shop_Addr2;
	public String Shop_City;
	public int Shop_zip;
	public String Latitude;
	public String Longitude;
	
	public String getShop_Name() {
		return Shop_Name;
	}
	public void setShop_Name(String shop_Name) {
		Shop_Name = shop_Name;
	}
	public String getShop_Addr1() {
		return Shop_Addr1;
	}
	public void setShop_Addr1(String shop_Addr1) {
		Shop_Addr1 = shop_Addr1;
	}
	public String getShop_Addr2() {
		return Shop_Addr2;
	}
	public void setShop_Addr2(String shop_Addr2) {
		Shop_Addr2 = shop_Addr2;
	}
	public String getShop_City() {
		return Shop_City;
	}
	public void setShop_City(String shop_City) {
		Shop_City = shop_City;
	}
	public int getShop_zip() {
		return Shop_zip;
	}
	public void setShop_zip(int shop_zip) {
		Shop_zip = shop_zip;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		this.Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		this.Longitude = longitude;
	}
	
	public RepairShop (String shop_name, String shop_addr1, String shop_addr2, String shop_city, int shop_zip, String latitude, String longitude ) {
			
		this.Shop_Name = shop_name;
		this.Shop_Addr1 = shop_addr1;
		this.Shop_Addr2 = shop_addr2;
		this.Shop_City = shop_city;
		
		
	}
	
}
