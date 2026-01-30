package assignAbstration;

import java.util.Scanner;

public class Contractor extends Employee {
       
	@Override
	public void calculateSalary(int payment) {
		System.out.println("Payment per hour: "+payment);
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the working hours:");
	int hours=sc.nextInt();
	if(hours<8) {
	System.out.println("payment per hours:"+hours*payment);
	}else {
		System.out.println("Fulltime employee salary: "+payment*8);
	}
		
	}

	public static void main(String[] args) {
		Contractor c=new Contractor();
		c.calculateSalary(100);
	}

}
