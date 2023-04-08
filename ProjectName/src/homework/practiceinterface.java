package homework;

public interface practiceinterface {
	
	public static void cycle() {
		
	}
	
	public void car() ;
		
    void bike();
    
    default void motor() {
    	System.out.println("motor in class ");
    }

    public static void main(String[] args) {
		
    	practiceinterface v=new practiceinterface ();
    	v.bike();
    	v.car();
    	
	}
}
