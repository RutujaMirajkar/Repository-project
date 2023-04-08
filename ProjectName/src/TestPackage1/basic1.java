package TestPackage1;

public class basic1 {
	
	static  int Demo() { // user define method declaration
		
		int x=78;
		int y=35;
		int z=x+y;
		
		//System.out.println(z);
		
		return z;
		
		
	}
	
	static String test () { // usre define method declaration
		
		return ("testing");
	
	}

	public static void main(String[] args) {
		System.out.println("abcde");
		int z=Demo();// user define method
		
		Demo(); //user define method int datatype
		System.out.println(z);
		
	       test(); //user define method String type data 
	
	
		System.out.println();
	}
	
}
