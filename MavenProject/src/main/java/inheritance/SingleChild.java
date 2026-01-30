package inheritance;

public class SingleChild extends SingleParent {
	public int sum(int a, int b) {
		int sum=a+b;
		return sum;
	}
public static void main(String[] args) {
	SingleChild s = new SingleChild();
	System.out.println(s.sum(11, 22));
	s.display();
	System.out.println(s.decimal(20.0f, 30.0f));
	}
}
