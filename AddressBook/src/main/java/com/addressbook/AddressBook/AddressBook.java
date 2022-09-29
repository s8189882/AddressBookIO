package com.addressbook.AddressBook;

import java.io.IOException;

public class AddressBook {
	
	public static void main(String[] args) throws IOException {
		AddressBookMethods entry = new AddressBookMethods();
	
		System.out.println("Welcome to Address Book Program in Java!");
		System.out.println("You can create and modify Contacts in the Address Book with first/last names, address, city, state, zip, phone number and email and so on");
	
		entry.manageAddressBookList();
	}
}
