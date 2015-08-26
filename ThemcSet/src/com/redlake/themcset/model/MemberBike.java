package com.redlake.themcset.model;

public class MemberBike {

	public String Make;
	public String Model;
	public String Manufacture;
	public int Model_Year;
	public String Purchase_Dt;
	public String Comments;
	public String Dealer;
	public String Serial_nbr;
	public String Lic_nbr;
	public String For_sale;
	public int Miles;
	public String Last_dt;
	
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getManufacture() {
		return Manufacture;
	}
	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}
	public int getModel_Year() {
		return Model_Year;
	}
	public void setModel_Year(int model_Year) {
		Model_Year = model_Year;
	}
	public String getPurchase_Dt() {
		return Purchase_Dt;
	}
	public void setPurchase_Dt(String purchase_Dt) {
		Purchase_Dt = purchase_Dt;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getDealer() {
		return Dealer;
	}
	public void setDealer(String dealer) {
		Dealer = dealer;
	}
	public String getSerial_nbr() {
		return Serial_nbr;
	}
	public void setSerial_nbr(String serial_nbr) {
		Serial_nbr = serial_nbr;
	}
	public String getLic_nbr() {
		return Lic_nbr;
	}
	public void setLic_nbr(String lic_nbr) {
		Lic_nbr = lic_nbr;
	}
	public String getFor_sale() {
		return For_sale;
	}
	public void setFor_sale(String for_sale) {
		For_sale = for_sale;
	}
	public int getMiles() {
		return Miles;
	}
	public void setMiles(int miles) {
		Miles = miles;
	}
	public String getLast_dt() {
		return Last_dt;
	}
	public void setLast_dt(String last_dt) {
		Last_dt = last_dt;
	}
	
	public MemberBike (String make, String model,String manufacture, int model_year, String purchase_dt, String comments, String dealer,
			String serial_nbr,  String lic_nbr, String for_sale, int miles, String last_dt)  {
		
		 this.Make = make;
		 this.Model = model;
		 this.Manufacture = manufacture;
		 this.Model_Year = model_year;
		 this.Purchase_Dt = purchase_dt;
		 this.Comments = comments;
		 this.Dealer = dealer;
		 this.Serial_nbr = serial_nbr;
		 this.Lic_nbr = lic_nbr;
		 this.For_sale = for_sale;
		 this.Miles = miles;
		 this.Last_dt = last_dt;
		
	}
	
}
