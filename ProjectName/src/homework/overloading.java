package homework;

public class overloading {
//non static overloading 	
	public void test() {
		System.out.println("overloading a");
	}
	public  void test(int a) {
		System.out.println("b");
	}
	
	
//static overloading 	
	public static void addition(int c,int d) {
		System.out.println(c+d);
	}
	
	public static void addition(int e, int f, int g ) {
		System.out.println(e+f+g);
	}
	
	
public static void main(String[] args) {
	overloading x=new overloading();
	
	x.test();
	x.test(990);
	
	//static method calling 
	overloading.addition(90,10);
	overloading.addition(40, 50, 60);
}
}
