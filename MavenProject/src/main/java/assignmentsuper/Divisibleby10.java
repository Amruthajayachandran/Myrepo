package assignmentsuper;

public class Divisibleby10 extends Addition {
     public  void display() {
         int addResult=super.add(10,30);
         if(addResult%10==0) {
        	 System.out.println("AddResult is divisible by 10");
         }else {
        	 System.out.println("Not divisible by 10");
         }
     }
     
	public static void main(String[] args) {
		Divisibleby10 d=new Divisibleby10();
		d.display();

	}

}
