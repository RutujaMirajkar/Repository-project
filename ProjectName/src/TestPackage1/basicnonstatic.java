package TestPackage1;

public class basicnonstatic {//non static method declare in same class
	                       // call in same class
	
	public void Demo() { // user define non static method declare
		
	 System.out.println("Demo method running ");
	 
	}
	
	public static void Test () { // UD static method  no need of object coz of static
		System.out.println("test method running");
		
	}
	public static void main (String[] args) {
		
		basicnonstatic x = new basicnonstatic();
	
	     x.Demo();
	     x.Test();
	     
	}
}
