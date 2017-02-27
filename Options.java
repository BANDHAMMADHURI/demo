package com.full.contact.controller;

import java.util.Scanner;

public class Options {
	Scanner scanner = new Scanner(System.in);
	public void printMainMenuOptions() {
		System.out.println("1. Add to contatcss");
		System.out.println("2. View contact");
		System.out.println("3. Delete contact");
		System.out.println("4. Quit");
	}

	public int getChoice() {
			
		int choice = scanner.nextInt();
		return choice;
	}
	
}
