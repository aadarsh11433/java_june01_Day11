package com.Problem2;

import java.util.Scanner;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};

	
	
	public void searchOutdatedModel(String... model) {
		
		for(String  a : model) {
			
			boolean flag = false; 
			
			for(String b : outdatedModels) {
				
				if (a.equalsIgnoreCase(b)) {
					flag = true;
					break;
				}
				
			}
			
			if(flag) {
				System.out.println(a+"_OUTDATED");
			}
		}
		
		
	}
	
	
	/*    <<------------------------------ Method for Array Input (argument) ------------------------------------>>  */
	
	
	public void searchOutdatedModel2(String[] model) {
		

		for(String  a : model) {
			
			boolean flag = false; 
			
			for(String b : outdatedModels) {
				
				if (a.equalsIgnoreCase(b)) {
					flag = true;
					break;
				}
				
			}
			
			if(flag) {
				System.out.println(a+"_OUTDATED");
			}
		}
		

	}
	
	     public static void main(String[] args) {
		
	    	 Scanner sc =new Scanner(System.in);
	    	 
	    	 Mobile mobile = new Mobile();
	    	 
	    	
	    	 mobile.searchOutdatedModel("note","noteh","note6","asd","dsaddfsf","note7");
	    	 
	    	 /*      <<------------------------------ passing as an array from user input ------------------------------->>*/
	    	 
	    	 
             System.out.println("enter how many mobiles you wanna check");
	    	 
	    	 int number  = sc.nextInt();
	    	 String[] arr = new String[number];
	    	 
	    	 for(int a=0;a<number;a++) {
	    		 
	    		 System.out.println("Enter Model :"+(a+1));
	    		 arr[a]  = sc.next();
	    		 
	    		 
	    	 }
	    	 
	    	 mobile.searchOutdatedModel2(arr);
	 }
	
}

/*

Q2)Create a Java class name Mobile with a single method “searchOutdatedModel()” that can accept the
name of a Mobile company and any number of its model names.
Note: Use suitable argument for searchOutdatedModel method.
Note: The user can supply any number of model names, even the user can supply only
the company name without its model also.

Mobile class has following instance variable-
String[] outdatedModels = {"note4","note5","note6","note7"};

If user supplied mobile model matches with any of the above outdated models, then
print that model name postfix with OUTDATED word example(note4_OUTDATED).

*/
