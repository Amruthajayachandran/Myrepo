package collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println(list);
		
//add() - To add elements
		
		list.add("red");
		list.add("blue");
		list.add("black");
		list.add("black");
		list.add(null);
		list.add(null);
		list.add("black");
		System.out.println(list);
		
//inderOf()- returns the index of the given element and
//returns first occurrence when there's is duplicate elements
		System.out.println(list.indexOf("black"));
		
//lastIndexOf()- returns the  index of the last duplicate element
        System.out.println(list.lastIndexOf("black"));
//get() - get the element based on the index
        System.out.println(list.get(1));
        
//contains()- checks whether the element is present or not
        System.out.println(list.contains("black"));
        System.out.println(list.contains("green"));
        
//remove()- remove elements based on index and object either
        System.out.println(list.remove(6));
        System.out.println(list.remove("red"));
        System.out.println(list);
        
//isEmpty()- checks whether the collection is empty or not
        System.out.println(list.isEmpty()); 
        
//size()- returns the size of the list
    	System.out.println(list.size());
    	
//for loop - used to iterate elements using index
    	System.out.println("FOR LOOP");
    	for(int i=0;i<list.size();i++) {
    		System.out.println(list.get(i));
    	}
    	
//for each loop - used to iterate elements without using index
    	System.out.println("FOR EACH LOOP");
    	for(String li:list) {
    	System.out.println(li);
	}
	

}
}
