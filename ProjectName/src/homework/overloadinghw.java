package homework;

public class overloadinghw {
	
	public void run(){
		System.out.println("running with joggers");
	}

	public void run(int a) {
		System.out.println("3200m run");
	}
	
	public static void walk() {
		System.out.println("likke a kitten");
	}
	public static void walk(int c,int d) {
		System.out.println("50-50 struggle");
	}
  
	public static void main (String []rutu) {
		overloadinghw n = new overloadinghw();
	   n.run();
	   n.run(3200);
	   n.walk();
	   n.walk(50, 50);
		
	}

}
