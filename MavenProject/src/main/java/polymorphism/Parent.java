package polymorphism;

public class Parent {
public void display() {
	System.out.println("parent properties....loading");
}
public int add(int a , int b) {
	int sum=a+b;
	return sum;
}

public void message(String name) {
	System.out.println("name is "+name);
}
}
