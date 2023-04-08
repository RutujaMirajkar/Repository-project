package methods;

public class Block1 {
	{
		System.out.println("non static block is running");
	}
 public static void main(String[] args) {
	System.out.println("main method is running");
	Block1 x = new Block1();
}
  static {
	  System.out.println("static block");
  }
}
