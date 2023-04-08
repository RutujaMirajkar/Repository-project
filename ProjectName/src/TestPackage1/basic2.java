package TestPackage1;

public class basic2 { //static method declare in same class
	                  // and call in same class
	
	public static void Demo() {  //user define method declaration
		System.out.println("demo method running");
			
	}
	public static void Test() {
		System.out.println("Test method running");
	}

	public static void main (String[] args) {
		Demo();
		Test();
	}
}
