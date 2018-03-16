package emailapp;

import java.io.IOException;
import java.util.Scanner;

public class MenuService {
	email em1;
	public MenuService(email em) {
		this.em1  = em;
	}
	Scanner sc = new Scanner(System.in);
	int choice;
	 public void showmenu() {
		
		 while(true) {
		 printmenu();
	if(choice==5) {
		break;
	}
switch(choice) {
 case 1:
	changepass();
	pressAnyKey();
	
	break;
	
 case 2:
	 changeMailCap();
	 pressAnyKey();
	 break;
	
case 3:		
	altmail();
	pressAnyKey();
	break;
	
case 4:
	System.out.println("-----------------------------------");
	System.out.println(em1.ShowInfo());
	System.out.println("-----------------------------------");
	pressAnyKey();
	break;
	 
case 0:
    System.exit(0);
	break;
	}

		 }
	 }

public void printmenu() {
System.out.println("-----------------------------------");
System.out.println("Menu options");
System.out.println("1: Change Password");
System.out.println("2: Change Mail Box Capacity");
System.out.println("3: Set Alternate Email ID");
System.out.println("4: Show Info");
System.out.println("5: Generate New Employee Email");
System.out.println("0: Exit Application");
System.out.println("-----------------------------------");
System.out.println("Enter the Option Choice :");
  choice = sc.nextInt();
}
public void changepass() {
	 System.out.println("Enter New PassWord: ");
	 sc.nextLine();
		String setpass = sc.nextLine();
	    em1.setPassword(setpass);
		System.out.println("Your new Password is : " + em1.getpassword());
 }
public void changeMailCap() {
	System.out.println("Enter new Mail Box Capacity: ");
	int setcapcity = sc.nextInt();
	em1.setmailboxCapacity(setcapcity);
	System.out.println("New mail Box Capacity is :" + em1.getmailboxCapacity() + "MB" );

}
public void altmail() {
	System.out.println("Enter new Alternate Email ID: ");
	String mail = sc.next();
	em1.setalternateEmail(mail);
    System.out.println("Your Alternate Email is : " + em1.getalternateEmail());
}
public void pressAnyKey(){
	System.out.println("Press any Key to Continue...");
	try {
		System.in.read();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
  
}



