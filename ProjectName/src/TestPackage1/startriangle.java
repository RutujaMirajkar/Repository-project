package TestPackage1;

public class startriangle {
	
	public static void main(String[] args) {
		
		int space =4;
		int star =1;
	
		for (int i=1;i<=9;i++) { // for row 
		
		for (int j=1;j<=space;j++) { //space 
			
			System.out.print(" ");
			
		}
		
		for(int k=1;k<=star;k++)
			System.out.print("*");
		
		    System.out.println();
		    
		    if(i<=4) {
		    	space--;
		    	star=star+2;
		    }
		    else {
		    	 space++;
		    	 star=star-2;// post decremet  so adhi save ani next line printn.
		  
		    	
		    }
		}
	}
}
		



