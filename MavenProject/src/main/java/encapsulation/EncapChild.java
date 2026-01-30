package encapsulation;

public class EncapChild {

	public static void main(String[] args) {
		EncapParent ep=new EncapParent();
		ep.setName("Ankitha");
		ep.setAge(23);
	System.out.println(ep.getName());	
	System.out.println(ep.getAge());

	}

}
