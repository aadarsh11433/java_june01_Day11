package com.Problem1;

public interface Y {

     void absMethodY();
	
	default void defMethodY() {
		System.out.println("inside the defualt method of interface Y");
	}
	
	public static void staMethodY() {
	
		System.out.println("inside the static method of interface Y");
	}
}
