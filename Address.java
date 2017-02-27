package com.full.contact.model;

public class Address {
	
	String street, city, country, pinCode, state, flatNum;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getFlatNum() {
		return flatNum;
	}

	public void setFlatNum(String flatNum) {
		this.flatNum = flatNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String toString()
	{
		return flatNum+"  "+street+" "+city+" "+pinCode+" "+state+" "+country;
	}

}
