package inheritance;

public class MultilevChild extends MultilevIntermediate {
	public void displaychild() {
		System.out.println("displaying child class property");
	}

	public static void main(String[] args) {
		
		MultilevChild mc = new MultilevChild() ;
		mc.display();
		mc.displayinter();
		mc.displaychild();
	}

}
