package aggregation;

public class AggreChild {
	String city;
	int pin;
	AggreParent ref;
public AggreChild(String city,int pin,AggreParent ref) {
   this.city=city ;
   this.pin=pin;
   this.ref=ref;
}
public void display() {
	System.out.println("city:"+city+"  pin:"+pin);
	System.out.println("name:"+ref.name+" age:"+ref.age);
}
public static void main(String[] args) {
	 AggreParent ap=new AggreParent("Ankitha", 23);
	 AggreChild ac=new AggreChild("kollam", 2318,ap);
        ac.display();
	}

}
