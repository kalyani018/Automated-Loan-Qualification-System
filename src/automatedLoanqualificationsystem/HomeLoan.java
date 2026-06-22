package automatedLoanqualificationsystem;



public class HomeLoan extends Loan {
	
	void getHomeLoanDocInfo(){
		System.out.println("HomeLoan documents have been submited");
	}
	

	public static void main(String[] args) {

		System.out.println("Welcome to HomeLoan Baning");
		
		HomeLoan h = new HomeLoan();		
		double empsal = h.getEmpSal();
		int empage = h.getEmpAge();
		int empcibil = h.getEmpCibilScore();
		
		if (empsal>=8000000.0 && empcibil >= 750 && empage>=22) {
			System.out.println("Your loan got approved");
			System.out.println("Your Loan ROI is: " +h.getLoanROI());
			System.out.println("Enter your Address details: ");
			String address = h.getEmpAddresssDEtails();
			System.out.println("Verify your Address Details as mentioned by you");
			System.out.println("Address Info:");
			System.out.println(address);
			h.getHomeLoanDocInfo();
			
			
		}else{
			System.out.println("Sorry!! Your loan approval got Rejected");
		}
		
		
		
	}
		
	
	}



