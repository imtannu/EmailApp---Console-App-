package emailapp;

import java.util.Scanner;

public class email {
	
private String firstName;
private String lastName;
private String password;
private String department;
private String email;
private String alternateEmail;
private int mailboxCapacity= 500;
private int defaultPasswordLength = 10;
private String companyname = "wipro.com";

Scanner sc = new Scanner(System.in);

// Constructor to receive first name and last name and department name and random password
  public email()
  {
	 System.out.println("Enter Employee's First Name: ");
	 this.firstName = sc.nextLine();
	 
	 System.out.println("Enter Employee's Last Name:");
	 this.lastName = sc.nextLine();
	
//call a method asking for department - return the department
	 
	 this.department = setDepartment();
	 //System.out.println("Department is:" + this.department);
	 
// call a method that - returns random password
	 
	  this.password = randomPassword(defaultPasswordLength);
	 // System.out.println("Your Password is:" + this.password);
	  
// combine elements to generate email id	
	  email= firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyname;
	  //System.out.println("Your Email ID:" + email);  
 }
  
// ask for the department
   private String setDepartment()
   {
	   System.out.println("New Emplayee: Mr." +firstName + " \nDepartment codes :\n1 for Sales \n2 for Development\n3 for Accounting\n0 for None \nEnter the Department code:");
	   Scanner sc = new Scanner(System.in);
	   int depChoice = sc.nextInt();
	  
	   if(depChoice == 1) {return "Sales";}
	   else if(depChoice == 2) { return "development";}
	   else if(depChoice == 3) { return "accounting"; }
	   else { return "";}
   }
//generate the random password
   private String randomPassword(int length) {
	   String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$";
	   char password[] = new char[length];
	   for (int i=0; i<length; i++) {
		   int rand = (int) (Math.random() * passwordSet.length());
		   password[i] = passwordSet.charAt(rand);
		   
// optional 
/*Random objGenerator = new Random();
            for (int iCount = 0; iCount< 10; iCount++){
              int randomNumber = objGenerator.nextInt(100);
              System.out.println("Random No : " + randomNumber); 
             }*/         				   
	   }
	 return new String (password);
   }
   
// method to show details 
   public String ShowInfo() {
	   return "Employee Name:  " + firstName + " " +lastName +
              "\nCompany Email:  " + email +
              "\nPassword :  " +password +
              "\nMailBox Capacity:  " + mailboxCapacity + "MB" ;   
   }

 // set the mail capacity
   public void setmailboxCapacity(int capacity) 
   {
	   this.mailboxCapacity = capacity;
   }
   
//set the alternate email
   public void setalternateEmail(String altemail) 
   {
  	 this.alternateEmail = altemail;
   }
   
// change the password
   public void setPassword(String Pass) 
   {
	   this.password = Pass;
   }
   
// return Capacity, alternateEmail, password 
   public int getmailboxCapacity() { return mailboxCapacity; }
   public String getalternateEmail() { return alternateEmail; }
   public String getpassword() { return password; }
   
 
  
}
