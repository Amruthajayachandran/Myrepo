package accessSpecifiers;

public class Access1 extends Access{

	public static void main(String[] args) {
		Access1 a = new Access1();
         a.defaul();
         a.prot();
         a.pub();
        // a.pri(); -outside the class,not acccessible(private)
         Access a1 = new Access();
         a1.defaul();
         a1.prot();
         a1.pub();
        // a1.pri();
	}

}
