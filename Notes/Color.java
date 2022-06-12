package com.Notes;

public class Color{
	
	enum Colour {  // fixed 
		RED,
		GREEN,
		BLUE;
	}
		public static void main(String[] args)

		{

			Colour[] c1 = Colour.values();

			for (Colour col : c1) {
				// Calling ordinal() to find index of color
				System.out.println(col + " at index " + col.ordinal());
				}
//
		}
	
}
	
	
		
		
	

	


