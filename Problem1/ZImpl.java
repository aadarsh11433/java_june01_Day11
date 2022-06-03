package com.Problem1;

public class ZImpl implements Z {

	@Override
	public void absMethodX() {
	
		System.out.println("overriding the abstract method inside the interface X");
		System.out.println("=================================");
	}

	@Override
	public void absMethodY() {
		
		System.out.println("overriding the abstract method inside the interface Y");
		System.out.println("=================================");
	}

	@Override
	public void printName() {
	
		System.out.println("Aadarsh Mukati");
		
		System.out.println("=================================");
		
	}
	@Override
   public void defMethodX() {
		
		System.out.println("inside the overridden  defualt method of interface X  inside the class ZImpl");
		System.out.println("=================================");
	}

}
