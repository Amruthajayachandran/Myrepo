package assignmentInheritance;

public class Salary extends TotalSalary {
	void displayslip() {
	System.out.println("Salary slip");	
	System.out.println("Pay: "+pay);
	System.out.println("HRA: "+hra_amount);
	System.out.println("PF: "+pf_amount);
	System.out.println("Deduction: "+deduction);
	System.out.println("Bonus: "+bonus);
	System.out.println("------------------------------");
	System.out.println("Total Salary: "+total);
		
		
		
	}
	
	public static void main(String[] args) {
		Salary s =new Salary();
		s.inputValues();
		s.calcu();
		s.totalSalary();
		s.displayslip();
	  
	}

}
