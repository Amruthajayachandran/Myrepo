package accessSpecifiers;

public class Access {
	
	public void pub() {
		System.out.println("Inside the public method");
	}
	
	private void pri() {
		System.out.println("Inside the private method");
	}
	void defaul() {
		System.out.println("Inside the default method");
	}
	protected void prot() {
		System.out.println("Inside the protected method");
	}

	public static void main(String[] args) {
		Access a = new Access();
		a.defaul();
		a.pri();
		a.pub();
		a.prot();

	}

}
