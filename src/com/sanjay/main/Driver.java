package com.sanjay.main;

import java.util.*;
import com.sanjay.model.Employee;
import com.sanjay.service.CredentialService;

public class Driver {
	
	private static char[] EmailAddress = null;

	public static void main(String []args) {
		
		CredentialService cs =new CredentialService ();

		Employee employee =new Employee("Sanjay", "Solanki");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int option = sc.nextInt();
		
		String emailAddress;
		char[] password = new char[8];
		
		switch (option) {
		
		case 1:
			emailAddress=cs.generateEmailAddress(employee.getfirstName(), employee.getlastName(), "Technical");
			password = cs.generatePassword();
			System.out.println(emailAddress);
			System.out.println(password);
			break;
			
		case 2:
			emailAddress=cs.generateEmailAddress(employee.getfirstName(), employee.getlastName(), "Admin");
			password = cs.generatePassword();
			System.out.println(emailAddress);
			System.out.println(password);
			break;
			
		case 3:
			emailAddress=cs.generateEmailAddress(employee.getfirstName(), employee.getlastName(), "Human Resource");
			password = cs.generatePassword();
			System.out.println(emailAddress);
			System.out.println(password);
			break;
			
		case 4:
			emailAddress=cs.generateEmailAddress(employee.getfirstName(), employee.getlastName(), "Legal");
			password = cs.generatePassword();
			System.out.println(emailAddress);
			System.out.println(password);
			break;
	   
		default:
			System.out.println("Please enter the valid option");  		
		}
	}
}
