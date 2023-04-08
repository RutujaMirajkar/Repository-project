package interfacetesting;

public class Set implements Test {
	
	public void Define() {// complete method or implemented method
		
		System.out.println("method define is running");
		
	}
	public void Setup() {
		System.out.println("method setup is running");
	}
	public static void main(String[] args) {
		Set y= new Set();//object of implementation class
	
	y.Setup();
	y.Define();
	}

}
