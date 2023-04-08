package TestPackage1;

public class andnot {
	 public static void main(String[] args)
	    {
	        // initializing variables
	        int a = 40, b = 50, c = 50, d = 0;
	  
	        {
	        System.out.println("Var1 = " + a);
	        System.out.println("Var2 = " + b);
	        System.out.println("Var3 = " + c);
	  
	        
	   
	        if ((a < b) && (b == c)) {
	            d = a + b + c;
	            System.out.println("The sum is: " + d);
	        }
	        else
	            System.out.println("False conditions");
	    }
	}

}
