package automatedLoanqualificationsystem;



public class PersonalLoan extends Loan {
	
	void getPersonalLoanDocInfo(){
		System.out.println("Personal Loan documents have been submited successful!");
	}
	
	private String hello() {
		return "Good Afternoon";
	}

	@Override
	double getLoanROI() {
		return 8.5;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Personal Loan Banking !!");
		
		// we can call both child and Parent functionalities
//		PersonalLoan p = new PersonalLoan();
		
		// we can call only parent class functionalites
		// Loan l = new Loan();
		
		// we can call the parent class functionalites and override methods from parent to child
		// Loan l = new PersonalLoan();
		
		//Type mismatch: cannot convert from Loan to PersonalLoan
		// PersonalLoan p = new Loan();
		Loan l2 = new PersonalLoan();
		System.out.println("Personal Loan ROI: " + l2.getLoanROI());
		
		PersonalLoan p =new  PersonalLoan();
		System.out.println(p.hello());
		double empsal = p.getEmpSal();
		int empage = p.getEmpAge();
		int empcibil = p.getEmpCibilScore();
		
		if (empsal>=8000000.0 && empcibil >= 750 && empage>=22) {
			System.out.println("Your loan got approved");
			System.out.println("Your Loan ROI is: " +p.getLoanROI());
			System.out.println("Enter your Address details: ");
			String address = p.getEmpAddresssDEtails();
			System.out.println("Verify your Address Details as mentioned by you");
			System.out.println("Address Info:");
			System.out.println(address);
			p.getPersonalLoanDocInfo();
		
			
			
			
		}else{
			System.out.println("Sorry!! Your loan approval got Rejected");
		}
		
		
		
	}

}
