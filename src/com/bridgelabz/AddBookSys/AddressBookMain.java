package com.bridgelabz.AddBookSys;
import java.util.*;

public class AddressBookMain {
	
	public ArrayList<Contact> persons;
	public HashMap<String, Contact> StatePersonMap;
    public HashMap<String, Contact> CityPersonMap;
    public ArrayList<Contact> personsMap;

	
	
	 Scanner sc = new Scanner(System.in);
	 Scanner sc1 = new Scanner(System.in);
	 Scanner sc2 = new Scanner(System.in);
	 
	 
	 
	 public AddressBookMain(){
		 
	       persons = new ArrayList<Contact>();  
	       StatePersonMap = new HashMap<String,Contact>();
	       CityPersonMap = new HashMap<String, Contact>();
	 }
	 
	 public Contact SearchByFirstName(String firstname){
   	  
		 Contact x = new Contact();
   	     for(int i=0;i<persons.size();i++){ 
   	    	 Contact y = (Contact)persons.get(i); 
   	    	 if(firstname.equals(y.firstname)){ 
   			   x = y;
   		     }  
   	     }
		 return x;
     }
	 
	 public void SearchByCity(String city){
	   	  
		 
   	     for(int i=0;i<persons.size();i++){ 
   	    	 Contact contact = (Contact)persons.get(i); 
   	    	 if(city.equals(contact.city)){
   	    	    	System.out.println("Firstname "+persons.get(i).firstname+" Lastname "+persons.get(i).lastname+
   	    	    			" Address "+persons.get(i).address+" City "+persons.get(i).city+" State "+persons.get(i).state+
   	    	    			" Zip "+persons.get(i).zip+" Phone number "+persons.get(i).number+" Email "+persons.get(i).email+"\n");   			    
   		     }  
   	     } 
     }
	 
	 public void SearchPersonByCityOrStateHashmap(String location, int StateOrCityFlag){
		 if(StateOrCityFlag ==0) {
			 Contact contact= CityPersonMap.get(location);
			 System.out.println("\n"+contact.firstname+" "+contact.lastname+" "+contact.address+" "+contact.city+" "+contact.state+" "+contact.number+" "+contact.email+" "+contact.zip+"\n");
		 }
		 else if(StateOrCityFlag ==1) {
			 Contact contact= StatePersonMap.get(location);
			 System.out.println("\n"+contact.firstname+" "+contact.lastname+" "+contact.address+" "+contact.city+" "+contact.state+" "+contact.number+" "+contact.email+" "+contact.zip+"\n");
		 }
	     
	 }
	 
	 public void AddDetails(){
		 
		 String firstname,lastname,address,city,state,zip,number,email;
   	     System.out.println("Enter your details:\n");
   	     System.out.println("Firstname\n");
   	     firstname=sc.nextLine();
   	     
   	     for(int i=0;i<persons.size();i++) {
   	    	 
   	    	Contact contacts= (Contact)persons.get(i);
            if(firstname.equals(contacts.firstname))
            {
                System.out.println("This Name is already present in this given AddressBook!!!!\n");
                return;
            }
   	    	 
   	     }
   	     
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
   	     System.out.println("State"+state);
   	     StatePersonMap.put(state, c);
   	     CityPersonMap.put(city, c);
   	     
   	     System.out.println("Contact Succesfully Added!!!\n\nContactList Contains\n");
   	     
   	     for (int i = 0; i < persons.size(); i++){ 
   	    	System.out.println(i+1+". Firstname "+persons.get(i).firstname+" Lastname "+persons.get(i).lastname+
   	    			" Address "+persons.get(i).address+" City "+persons.get(i).city+" State "+persons.get(i).state+
   	    			" Zip "+persons.get(i).zip+" Phone number "+persons.get(i).number+" Email "+persons.get(i).email+"\n"); 
         } 
   	 
     }
	 
	 public void EditDetailsByFirstName(String firstname) {
		 
		 System.out.println("Enter Choice of what you want to Edit\n\n\n1.FirstName\n2.Lastname\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone\n8.Email\n");
		 Contact a = SearchByFirstName(firstname);
		 int choice = sc1.nextInt();
		 
		 switch(choice) {
		 
		 case 1:
			 System.out.println("Enter new firstname: \n");
   		     a.firstname = sc2.nextLine();
   		     break;
   		 
		 case 2:
			 System.out.println("Enter new lastname: \n");
   		     a.lastname = sc2.nextLine();
   		     break;
   		     
		 case 3:
			 System.out.println("Enter new address: \n");
   		     a.address = sc2.nextLine();
   		     break;
   		     
		 case 4:
			 System.out.println("Enter new city: \n");
   		     a.city = sc2.nextLine();
   		     break;
   		     
		 case 5:
			 System.out.println("Enter new state: \n");
   		     a.state = sc2.nextLine();
   		     break;
   		     
		 case 6:
			 System.out.println("Enter new zip: \n");
   		     a.zip = sc2.nextLine();
   		     break;
   		     
		 case 7:
			 System.out.println("Enter new ph. number: \n");
   		     a.number = sc2.nextLine();
   		     break;
   		     
		 case 8:
			 System.out.println("Enter new email id: \n");
   		     a.email = sc2.nextLine();
   		     break;
		 default:
			 break;	 
		 }
		 
         System.out.println("Contact Succesfully Edited!!!\n\nContactList Contains\n");
   	     for (int i = 0; i < persons.size(); i++){
   	    	System.out.println(i+1+". Firstname "+persons.get(i).firstname+" Lastname "+persons.get(i).lastname+
   	    			" Address "+persons.get(i).address+" City "+persons.get(i).city+" State "+persons.get(i).state+
   	    			" Zip "+persons.get(i).zip+" Phone number "+persons.get(i).number+" Email "+persons.get(i).email+"\n"); 
         } 
		 
		 
		 
	 }

	 public void DeleteByFirstName(String firstname) {
		 
		 for(int i=0;i<persons.size();i++){
			 
			 Contact x = (Contact)persons.get(i);
			 if(firstname.equals(x.firstname)){
				 persons.remove(i);
			 }
		 }
         System.out.println("Contact Succesfully Deleted!!!\n\nContactList Contains\n"); 	     
   	     for (int i = 0; i < persons.size(); i++){ 
   	    	System.out.println(i+1+". Firstname "+persons.get(i).firstname+" Lastname "+persons.get(i).lastname+
   	    			" Address "+persons.get(i).address+" City "+persons.get(i).city+" State "+persons.get(i).state+
   	    			" Zip "+persons.get(i).zip+" Phone number "+persons.get(i).number+" Email "+persons.get(i).email+"\n"); 
         }	  
   	  
	 }

}