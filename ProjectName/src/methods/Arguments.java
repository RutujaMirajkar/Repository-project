package methods;

public class Arguments {
	
	//public static void main() {                         // user define method just because does not have arguments
		
		
		
	//}
	
  //public static void main (String[] args) {             // system define method just because it has arguments
	  
 // }
	

	
	
	public static void addition(  ) {
		
		int a=49;
		int b=74;
		int c=a+b;
		
		System.out.println(c);
	}
	
	
	public static void substraction (float x, float y) {
		float w =x-y;
		
		System.out.print("substraction = "+ w );
		System.out.println();
		
	}
	 
	public static void main(String[] ho) {
		
	     addition();
	     
	     substraction (42.7f,36);
	     substraction (78.7f,36);
	     substraction (90.7f,36);
		
	 }
	
	
}


