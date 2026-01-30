package polymorphism;

public class Child extends Parent{
	
	public int add(int a,int b) {
		System.out.println(super.add(10, 30));
		int sum=a+b;
		return sum;
		
	}
	@Override
	public void message(String age) {
		super.message("AMMU");
		System.out.println("age is "+age);
	}
	public void display() {
	super.display();
	System.out.println("child properties....loading");
	}
//	public void message(String name) {
//		System.out.println("name is:"+name);
//	}
	public static void main(String[] args) {
		
       Child c =new Child();
       c.display();
       System.out.println(c.add(10,20));
        c.message("20");
	}

}
