package encapsulation;

public class EncapChild1 {

	public static void main(String[] args) {
		EncapParent1 ep=new EncapParent1();
		ep.setCity("kollam");
		System.out.println(ep.getCity());
		ep.setPin(231);
		System.out.println(ep.getPin());
		
		

	}

}
