package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// set is unordered /output is not ordered ,so index based methods are not applicable
		//Duplicate is not allowed
		Set<String> s=new HashSet<String>();
		s.add("Apple");
		s.add("Orange");
		s.add("Apple");
		s.add("kiwi");
		s.add(null);
		s.add("guva");
		System.out.println(s);
		s.remove("kiwi");
		System.out.println(s);
		s.clear();
		System.out.println(s);
        //other methods- isEmpty(),size(),add(),addAll(),contains().....
		
	}

}
