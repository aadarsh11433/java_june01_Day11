package com.Problem1;

public interface X {

	void absMethodX();
	
	default void defMethodX() {
		System.out.println("inside the defualt method of interface X");
	}
	
	public static void staMethodX() {
	
		System.out.println("inside the static method of interface X");
	}
	
	
}

