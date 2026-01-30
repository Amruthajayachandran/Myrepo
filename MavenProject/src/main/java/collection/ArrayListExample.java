package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("white");
		a.add("black");
		a.add("black");
		a.add("blue");
		a.add("red");
		a.add(null);
		a.add(null);
		System.out.println(a);
        ArrayList<String> i=new ArrayList<String>();
        i.add("1");
        i.add("2");
        i.add("3");
        i.add("2");
        i.add("5");
       
        System.out.println(i);
        //addAll()- to add one array to another a to i
        System.out.println(i.addAll(a));
        System.out.println(i);
        //containsAll()- to find an array present on another array/not eg:a present on i
        System.out.println(i.containsAll(a));
        System.out.println(a.containsAll(i));
        
        Iterator<String>it=a.iterator();
        //to enter the loop while there is more than 1 element
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        //to remove last element
        it.remove();
        System.out.println(a);
	}

}
