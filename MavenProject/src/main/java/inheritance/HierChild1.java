package inheritance;

public class HierChild1 extends HierParent {
   public int Choice(int n) {
	   System.out.println("Choice:");
	   return n;
   }
	public static void main(String[] args) {
		HierChild1 hc= new HierChild1();
		System.out.println(hc.Choice(1));
		System.out.println(hc.sentence("Hey What's up,,!!!"));

	}

}
