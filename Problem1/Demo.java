package com.Problem1;

public class Demo {

	public static void main(String[] args) {
		
		ZImpl obj  =  new  ZImpl();
		
		System.out.println("overriden methods  ------->");
		
		obj.absMethodX();
		obj.absMethodY();
		obj.defMethodX();
		obj.printName();
		
		System.out.println("=================================");  //
		
		System.out.println("static methods  ------------>");

		X.staMethodX();
		Y.staMethodY();
		
		System.out.println("=================================");
		
		System.out.println("Default method of interface Y ------------>");

		Y.staMethodY();     // default method can be called using interfacename.methodname(); as static method of interface
		obj.defMethodY();  // default methods of interface are available without overriding them 
	}

}
