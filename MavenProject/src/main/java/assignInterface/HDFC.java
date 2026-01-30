package assignInterface;

public class HDFC implements RBI{
	@Override
	public void recurringDeposit(double amount, int duration) {
		System.out.println("Amount: "+amount+" Duration: "+duration);
		double interest= amount*(interestRate/100);
		double interestPerDay=interest*1;
		System.out.println("Interest for one day: "+interestPerDay);
		double interestPerDuration=interest*duration;
		System.out.println("interest per given duration: "+interestPerDuration);
	}
	public static void main(String[] args) {
		RBI r =new HDFC();
		r.recurringDeposit(10000.0, 20);

	}

	

}
