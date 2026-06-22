package automatedLoanqualificationsystem;

import java.util.Scanner;

public class Loan {
static Scanner sc = new Scanner(System.in);
	
	String getEmpAddresssDEtails(){
		String address = "";
		
		System.out.println("Enter your flat number: ");
		String flat = sc.next();
		
		System.out.println("Enter plot details: ");
		String plot = sc.next();
		
		System.out.println("Enter Your Street: ");
		String street = sc.next();
		
		System.out.println("Enter your city: ");
		String city = sc.next();
		
		System.out.println("Enter your Pincode: ");
		String pin = sc.next();
		
		address = "Flat no: "+flat+ ", "+
				"Plot Details: "+plot+", "+
				"Street name: "+street + ", "+
				"City name: "+city + ", "+
				"Pincode: "+pin+", ";
		return address;
	}
	
	double getLoanROI() {
		return 9.5;
	}
	
	public int getEmpCibilScore(){
		System.out.println("Enter your Cibil Score: ");
		int cibil = sc.nextInt();
		return cibil;
	}
	
	public int getEmpAge(){
		System.out.println("Enter yoour age: ");
		int age = sc.nextInt();
		return age;
		
	}
	public double getEmpSal(){
		System.out.println("Enter  your salary info: ");
		double salary = sc.nextDouble();
		return salary;
	}
	
	


}
