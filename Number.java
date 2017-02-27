package com.full.contact.model;

public class Number {

	private String number;
	private String type;

	public void setNumber(String number) {
		this.number = number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String toString() {

		return this.number + "-" + this.type;
	}
}
