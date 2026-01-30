package abstraction;

public class AbstraChild extends AbstraParent {
	public AbstraChild(int a) {
		super(5);
		
	}

	@Override
	void display() {
	System.out.println("Displaying.....");
	}

	public static void main(String[] args) {
		AbstraParent ab=new AbstraChild(10);
		ab.display();
        ab.demo("Ankitha");
	}

	
}
