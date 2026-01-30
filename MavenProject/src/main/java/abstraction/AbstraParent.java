package abstraction;

public abstract class AbstraParent {
	
	public AbstraParent(int a) {
		System.out.println("helloo...i'm here");
		System.out.println(a);
	}
abstract void display() ;
public void demo(String name) {
	System.out.println("name is "+name);
}
}