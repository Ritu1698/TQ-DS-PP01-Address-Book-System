package com.bridgelabz.AddBookSys;
import java.util.*;

public class AddressBookMain {
	
	ArrayList<Contact> persons;
	Scanner sc= new Scanner(System.in);
	 
	
	      public AddressBookMain() 
	      {
	            persons = new ArrayList<Contact>();
	      }
	      
	      public void AddName()
	      {
	    	
	    	  String firstname,lastname,address,city,state,zip,number,email;
	    	  System.out.println("Enter your details:\n");
	    	  System.out.println("Firstname\n");
	    	  firstname=sc.nextLine();
	    	  System.out.println("Lastname\n");
	    	  lastname=sc.nextLine();
	    	  System.out.println("Address\n");
	    	  address=sc.nextLine();
	    	  System.out.println("City\n");
	    	  city=sc.nextLine();
	    	  System.out.println("State\n");
	    	  state=sc.nextLine();
	    	  System.out.println("Zip\n");
	    	  zip=sc.nextLine();
	    	  System.out.println("Phone No.\n");
	    	  number=sc.nextLine();
	    	  System.out.println("Email\n");
	    	  email=sc.nextLine();
	    	  Contact c= new Contact(firstname, lastname, address, city, state, zip, number, email);
	    	  persons.add(c);
	    	  System.out.println("Contact Succesfully Added!!!\n\nContactList Contains\n");
	    	  for (int i = 0; i < persons.size(); i++)
	    	  { 
	    		   System.out.print(i+1+". "+persons.get(i).firstname + " "); 
	          } 
	    	  
	      }
	      
	      public static void main(String[] args) {
	    	  System.out.println("Welcome to Address Book Program in AddressBookMain class on Master Branch \n");
	    	  AddressBookMain a= new AddressBookMain();
	    	  a.AddName();
		}
	      
	 

}