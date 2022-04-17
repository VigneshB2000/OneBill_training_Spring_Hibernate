package com.ty.marshalling;

public class Address {
	
	private String doorNo;
	private String area;
	private String locality;
	private String Country;
	private int pincode;
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", area=" + area + ", locality=" + locality + ", Country=" + Country
				+ ", pincode=" + pincode + "]";
	}

}
