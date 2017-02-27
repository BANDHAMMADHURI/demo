package com.full.contact.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.full.contact.view.Contact;

public class ContactApp {
	public static void main(String args[]) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Contact> list = new ArrayList<Contact>();
		Options option = new Options();

		do {
			option.printMainMenuOptions();
			int i = option.getChoice();

			switch (i) {
			case 1:
				Contact contact = new Contact();

				contact.userName();
				contact.usarNumber();
				contact.userAddress();
				contact.userEmail();
				contact.userWebsite();

				int j = 0;
				list.add(j, contact);

				j++;
				System.out.println("main menu(yes/enything)");
				break;
			case 2:
				System.out.println(list);
				System.out.println("Main menu (yes/enything)");
				break;
			case 4:
				break;
			case 3:

				if (list.size() == 0)
					System.out.println(
							"the contact list is empty, add atleast one contact to perform delete operation  :)");
				else {
					System.out.println("enter first name of contact(wan to delete)");
					String s2 = scan.next();

					for (int m = 0; m < list.size(); m++) {
						Contact s3 = list.get(m);
						if (s3.toString().startsWith(s2)) {
							list.remove(s3);
							System.out.println("contact deleted");
						} else
							System.out.println("no such contact found");
					}

				}

				System.out.println("Main menu(yes/no)");
				break;
			default:
				break;
			}
		} while (scan.next().equals("yes"));
		scan.close();

	}
}
/*
 * class ConsoleViewManager {
 * 
 * public void printGetChoice() { sop("Please enter choice: ");
 * 
 * }
 * 
 * public int getChoice() { Scanner scanner = new Scanner(System.in); int choice
 * = scanner.nextInt(); return choice; }
 * 
 * public void printMainMenuOptions() { sop("1. View contact");
 * sop("2. Enter new contact"); sop("3. Delete contact"); sop("0. Quit"); }
 * 
 * public int getEnterContactChoice() { sop("1. Enter name");
 * sop("2. Enter phone"); sop("3. Return to main menu."); }
 * 
 * } 11:19 am Choose Files
 * 
 * Type Here... New updates
 */