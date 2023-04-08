package array;

import java.util.Arrays;

public class basicarray {// for loop asendending order
	
	
	public static void main(String[] args) {
		
	
	int a[]= {30,800,70,60,40};
	
	
	
	for (int i=0;i<=a.length-1;i++) {
		
		System.out.println(a[i]);
		
		}
	
	Arrays.sort(a);
	System.out.println("asending");
	
	for (int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
		}
	}
	
	}

