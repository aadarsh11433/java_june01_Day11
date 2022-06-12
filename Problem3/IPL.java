package com.Problem3;

import java.util.Scanner;

public class IPL {

	
	 void homeTeamStadium(Stadium stadium) {  //
		 
		switch(stadium) {
		
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
		break;
		
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is the home ground of CSK");
		break;
		
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of RCB");
		break;
		
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai Indians");
		break;
		
		
		
		}
	 }
	
	public static void main(String[] args) {
		
		IPL obj = new IPL();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name of the stadium"); 
		
		String stadium = scan.next();
		
		try { // 
			
			Stadium name = Stadium.valueOf(stadium);
			
			System.out.println(name);
			
			obj.homeTeamStadium(name);
			
		}catch(IllegalArgumentException e){
			
			System.out.println("please pass a valid  stadium ");
			System.out.println(e);
			System.out.println(stadium+" is not a valid stadium");
			
		}
		
		 
	}
}
