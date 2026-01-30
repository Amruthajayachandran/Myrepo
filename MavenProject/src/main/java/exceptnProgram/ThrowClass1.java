package exceptnProgram;

public class ThrowClass1 {
	
	//THROW
	
//	public static void main(String[] args)  {		
//		int age=10;
//		if(age>18) {
//			System.out.println("Eligible for voting");
//		}else {
//			throw new ArithmeticException("Not Eligible");
//		}
//	}}
		
		//THOWS
		
		public static void main(String[] args1)throws Exception  {
		int age=10;
		if(age>18) {
			System.out.println("Eligible for voting");
		}else {
			throw new Exception("Not Eligible");
		}}
	}


