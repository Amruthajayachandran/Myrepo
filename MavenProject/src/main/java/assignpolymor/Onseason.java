package assignpolymor;

public class Onseason extends Offseason {

	@Override
	public void discount(double amount) {
		super.discount(amount);
		double offer=amount*0.4;
		System.out.println("Onseason price: "+offer);
	}
public static void main(String[] args) {
	Onseason os=new Onseason();
	os.discount(2500.0);
}
}
