
public class demo {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");
		StringBuilder sb =new StringBuilder("World");
	
		System.out.println(s.append("map"));
		System.out.println(s.replace(2, 3, "hl"));
		System.out.println(s.indexOf("e"));
		System.out.println(s.delete(0, 1));
		System.out.println(s.reverse());
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(sb.insert(2," sun"));
		
		
	}
    
}
