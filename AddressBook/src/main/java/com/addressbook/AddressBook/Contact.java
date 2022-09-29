package com.addressbook.AddressBook;

public class Contact {
	
	String firstName;
	String lastName;
	Address address;
	String phoneNumber;
	String emailID;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}	

	@Override
	public String toString() {
		return "\nContact Info : \nFirst Name : " + firstName + "\nLast Name : " + lastName + "\nAddress :\n" + address + "\nPhone Number : "
				+ phoneNumber + "\nEmail ID : " + emailID;
	}
}
