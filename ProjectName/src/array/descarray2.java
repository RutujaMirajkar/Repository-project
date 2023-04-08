package array;

import java.util.Arrays;

public class descarray2 {

	public static void main(String[] args) {
		
	
		int a[] =(700,400,500,900,100,300,500);
		
		
		
		Arrays.sort(a);
		
		System.out.println("descending");
				for (int i=a.length-1;i>=0;i--)
				{
					System.out.println(a[i]);
				}
}
}
