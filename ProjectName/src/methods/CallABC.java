package methods;

public class CallABC extends ABCabs {
	public void Rest() {
		System.out.println("implementof abc");
	}
	public void Test() {
		System.out.println("Test method reimplement");
	}
	public static void main(String[] args) {
		
	
	CallABC m = new CallABC();
	m.Rest();
	m.Test();
	
	ABCabs y= new CallABC();// same constructor taken and reference of 
    y.Rest();          // abstract class
	y.Test();
	// for overriding 
	
	}

}
