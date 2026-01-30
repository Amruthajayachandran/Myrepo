package interfaceDemo;

public class InterChild implements InterParent,InterParent2{
	@Override
	public void display() {
		System.out.println("Displaying....");
		
	}

	public static void main(String[] args) {
		InterChild ic=new InterChild();
		ic.display();
		ic.demo();
		InterParent.demo1();
        System.out.println(ic.num);
        ic.work();
	}

	@Override
	public void work() {
		System.out.println("Working....");
		
	}

	

}
