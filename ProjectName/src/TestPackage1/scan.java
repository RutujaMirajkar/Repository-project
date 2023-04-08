package TestPackage1;

import java.util.Scanner;

public class scan {
 
	public static void main(String[] args) {
		
		Scanner demo= new Scanner (System.in); // scanner class object
		
		System.out.println("Enter the integer: ");
		
		int value = demo.nextInt();     // method 
		
		System.out.println("Your entered value is: " + value);
		
		System.out.println();
		
		System.out.println("eneter the float: ");
		
		float value1 =demo.nextFloat();
		
		System.out.println("you entered value is: "+ value1);
		System.out.println();
		
		System.out.println("enter the String : ");
		
		String value2 =demo.next();
		
		System.out.println("you enetered value is :"+value2);
		
	}
}
