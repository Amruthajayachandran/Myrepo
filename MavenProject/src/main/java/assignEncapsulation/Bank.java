package assignEncapsulation;

public class Bank {
private int pinNo;

public int getPinNo() {
	if(pinNo==1001 ||pinNo==1234 ||pinNo==1212 ) {
		System.out.println("validation Successfull");
	}
		else {
			System.out.println("Invalid pinNo");
		}
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}


}

