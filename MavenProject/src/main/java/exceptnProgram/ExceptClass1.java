package exceptnProgram;

public class ExceptClass1 {
public static void main(String[] args) {
	try {
	int a=10;
	System.out.println("Arithmetic exception"+a/0);
	}//catch (ArithmeticException e) {
//		e.printStackTrace();
//		System.out.println("exception handled");
//}
	finally {
		System.out.println("Finally block....");
	}
	System.out.println("outside the finally block...");
//	int[] a= {1,2,3,4,5};
//	System.out.println("ArrayIndexOutOfBoundsException"+a[7]);
	 
//	String name=null; 
//	System.out.println("NullPointerException"+name.length());
	
}
}
