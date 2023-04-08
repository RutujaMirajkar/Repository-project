package array;

import java.util.Arrays;

public class basic{
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};//declaration of array
		
		//int size=a.length-1;
		//System.out.println(size);
		
		
		System.out.println("************all info in array***");
		
		
		for (int i=0; i<=a.length-1;i++) {
			
			System.out.println(a[i]);
			
		}
		
		Arrays.sort(a);//is for asending order
		System.out.println("******ALL INFO IN ASCENDING ORDER****");
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			}
	
		
		System.out.println("****all in descending order***");
		for (int i=5;i>=0;i--) {
			System.out.println(a[i]);
		}

	}
	

}
