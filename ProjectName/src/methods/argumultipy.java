package methods;

public class argumultipy {
	
public  void multiplication(int c, int d) { // non static method there fore object declaration is necessary
	
	int a = c*d;
	
	System.out.println("multiplication = "+ a);
}

public static void addition () {
  int p=13;
  int q=17;
  int r=p+q;
  
  System.out.print("addition = "+r);
}

  public static void main (String[] args) {
	 
	  argumultipy x = new argumultipy();  // object declare in main funxtion   class x= new class();	  
	  x.multiplication(45,2);
	  x.multiplication(50,5);
	  x.multiplication(14,9);
	  
	  addition();
  
  }
  


}
