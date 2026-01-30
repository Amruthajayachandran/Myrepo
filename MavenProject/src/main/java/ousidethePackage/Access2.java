package ousidethePackage;

import accessSpecifiers.Access;

public class Access2 extends Access{

	public static void main(String[] args) {
	Access2 a =new Access2();
	a.prot();
	a.pub();
	//a.defaul(); default and private are not accessible,outside the package 
	//a.pri(); 
    Access a1=new Access();
    a1.pub();
   // a1.defaul(); // default,private,protected not accessible by creating obj of parent class
   // a1.pri();
   // a1.prot();
	}

}
