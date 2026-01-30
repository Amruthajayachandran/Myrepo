package assignmentInheritance;

import java.util.Scanner;

public class Employee {
double pay,deduction,bonus;

public  void  inputValues(){	
Scanner sc = new Scanner(System.in);

System.out.println("enter the amount to pay: ");
  pay =sc.nextDouble();

System.out.println("Enter the deduction amount: ");
 deduction =sc.nextDouble();

System.out.println("Enter the bonus amount: ");
  bonus =sc.nextDouble();
}
}
