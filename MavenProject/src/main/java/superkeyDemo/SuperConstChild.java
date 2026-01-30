package superkeyDemo;

public class SuperConstChild extends SuperconstParent {
     public SuperConstChild() {
    	 super(" Ankitha");
    	 System.out.println(" child's default constructor");
     }
     public SuperConstChild(int a) {
    	 super(); 
     }
	public static void main(String[] args) {
		new SuperConstChild();
		new SuperConstChild(5);

	}
 	
}
