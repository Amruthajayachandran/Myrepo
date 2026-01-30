package inheritance;

public class HierChild2 extends HierParent {
 public void display() {
	 System.out.println("child2 is displaying now!!!");
 }
	public static void main(String[] args) {
		HierChild2 hcc = new HierChild2();
		hcc.display();
		System.out.println(hcc.sentence("hello,parent property here!!!"));
		

	}

}
