package interfaceDemo;

public interface InterParent {
	public static final int num=10; 
	int num2=20;
	
 abstract void display();
 default void demo() {
//	 num2=30; - Final 
	 System.out.println("default....");
 }
 static void demo1() {
	 System.out.println("static...");
 }
 }

