package stringprogram;

public class Stringmethods {
	public static void main(String[] args) {
		  String s="hello";
		  System.out.println("String by literals: "+s);
		  
          String s1 = new String("hi");
          System.out.println("String by new : "+s1);
          //Length() - method
          System.out.println("length "+s.length());
          System.out.println("length "+s1.length());
          //charAt() - method, Return character based on index
          System.out.println("char at index 2 -"+s.charAt(2));
          //concat() - method - add new string at the end of an another string
          System.out.println("concat "+s.concat(s1));
          //contains() - check a word /char and return in boolean
          System.out.println("contains - "+s.contains("he"));
          System.out.println("contains - "+s.contains(s1));
          //toUppercase - convert LC to UC (uppercase)
          System.out.println("toUppercase - "+s.toUpperCase());
         //toLowercase - convert UC to LC (lowercase)
          System.out.println("tolowercase - "+s.toLowerCase());
          //equals method-check two strings are equal or not and case sensitive and its compare mly loc
          String word1="java";
          String word2="Java";
          String word3="java";
          String word4=new String("java");
          String word5="";
          int num=10;
          String word6="  HEHEHE  ";
          String word7="where are you ??  ";
          System.out.println("equals method-"+word1.equals(word3));
          System.out.println("equals method-"+word1.equals(word2));
          //equalsIgnoreCase method -not case sensitive
          System.out.println("equalsIgnoreCase method- "+word1.equalsIgnoreCase(word2));
          
          System.out.println(word1==word4);
          System.out.println(word1.equals(word4));
          //isEmpty- check whether a string is empty or not
          System.out.println("isEmpty method- "+word1.isEmpty());
          System.out.println("isEmpty method- "+word5.isEmpty());
          //valueOf() - covert any datatype to string no change in o/p just like 10-->"10"
          System.out.println(String.valueOf(num));
          //trim() method- to removing first(leading) and end(tariling) vaccant spaces
          System.out.println(word6.trim());
          //substring()- to get wanted characters from a sequenece of char
          System.out.println(word7.substring(2, 8));
          System.out.println(word7.substring(2));
	}

}
