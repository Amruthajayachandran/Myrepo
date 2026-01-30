package assignmentAggre;
public class Address {
	String address;
	Student s;
	
	public Address(String address,Student s) {
		this.address=address;
		this.s=s;
	}
	void display() {
		System.out.println("Name: "+s.name+"  Rollno: "+s.rollNo+" Address: "+address);
//		System.out.println("Name: "+s.name+"  Rollno: "+s.rollNo);
	}
	public static void main(String[] args) {
		Student st=new Student("Ankitha", 23);
		Address a=new Address("street 2345",st);
		a.display();
		
	}
	}

