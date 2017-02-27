package com.full.contact.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.full.contact.model.Address;
import com.full.contact.model.Email;
import com.full.contact.model.Name;

import com.full.contact.model.Number;
import com.full.contact.model.Website;

public class Contact {
	ArrayList<Number> numberList = new ArrayList<Number>();
	public static List<String> l = new LinkedList<String>();
	Name name = new Name();
	Address address = new Address();
	Email email = new Email();
	Website webSite = new Website();
	Number ph = new Number();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public String contact1;

	public void userName() throws IOException {

		System.out.println("enter the first name");
		name.setFname(br.readLine());
		System.out.println("enter the middle name");
		name.setMname(br.readLine());
		System.out.println("enter the last name");
		name.setLname(br.readLine());
		System.out.println("enter the nick name");
		name.setNickName(br.readLine());

	}

	public void usarNumber() throws IOException {
		do {

			System.out.println("enter the number");
			ph.setNumber(br.readLine());
			System.out.println("enter the type(work/home/personal/land)");
			ph.setType(br.readLine());

			numberList.add(ph);
			System.out.println("want to add another number(yes/anything)");

		} while (br.readLine().equals("yes"));
	}

	public void userAddress() throws IOException {

		System.out.println("enter the flat number");
		address.setFlatNum(br.readLine());
		System.out.println("enter the street name");
		address.setStreet(br.readLine());
		System.out.println("enter the city");
		address.setCity(br.readLine());
		System.out.println("enter the pincode");
		address.setPinCode(br.readLine());
		System.out.println("enter the state");
		address.setState(br.readLine());
		System.out.println("enter the country");
		address.setCountry(br.readLine());

	}

	public void userEmail() throws IOException {
		do {

			System.out.println("enter your email :");
			email.setEmail(br.readLine());
			System.out.println("which email is this (work/home/personal/land)");
			email.setType(br.readLine());
			System.out.println("want to add another email(yes/anything)");

		} while (br.readLine().equals("yes"));
	}

	public void userWebsite() throws IOException {
		do {
			System.out.println("enter your  website");
			webSite.setWeb(br.readLine());
			System.out.println("want to add another website(yes/anything)");

		} while (br.readLine().equals("yes"));

	}

	public String toString() {
		contact1 = name + "\n" + numberList + "\n" + address + "\n" + email + "\n" + webSite;

		return contact1;
	}

}
