package interfacetesting;

public interface Defalt {
	//by default all are public
	//static 
	
	
	public static void xyz() {
		System.out.println("car needs petrol");
	}
	
	//nonstatic // incomplete
	public void show();
	
	//default
	public default void mart() {
		System.out.println("bike needs helmet");
		}

}
