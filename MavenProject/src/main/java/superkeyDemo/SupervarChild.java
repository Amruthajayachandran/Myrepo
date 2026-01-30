package superkeyDemo;

public class SupervarChild extends SupervarParent{
	 String name="aaron";
	 public void hello() {
		System.out.println (super.message("where are you??"));
		 System.out.println("hello....");
	 }
	 public void dispaly()
	 {
		 super.work();
		 super.message("hello....");
		 this.hello();
		System.out.println(super.name); 
		 
	 }	public static void main(String[] args) {
		SupervarChild s =new SupervarChild();
		System.out.println(s.name);
		s.dispaly();

	}

}
