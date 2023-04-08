package interfacetesting;

public  class imple implements Staticinterface{
	
	public void show() {
		System.out.println("show");
		
	}
	public static void cycle() {
		System.out.println("abs");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Staticinterface.xyz();
		imple.cycle();
		//imple.show();it  is non static cant be called like this
		//Staticinterface.y= new Staticinterface();
		//y.
		
		imple y =new imple();
		y.show();
	}
	
	

}
