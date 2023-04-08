package interfacetesting;

public interface Staticinterface {
	//interface is an incomplete method i,e abstract
	//i,e non static method is used but later java thought to have
	//an operation where static should get used 
	//that is why static is used though it is a complete 
	//in java 1.8 that doest mean interface is not incomplete.. 
	//interface is 100% in complete
	
	public static void xyz() {
		System.out.println("static is running");
		
	}
	
	public void show();

}
