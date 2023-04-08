package methods;

public class Staticnonstat {
	static int a=50; //static variable
	int b=40; //non static variable
	float c=60.90f;
	
	public static void main(String[] args) {
		System.out.println("static value =" +a);
	
		
		Staticnonstat x = new Staticnonstat();
		System.out.println("non static value =" +x.b); //40
		
		Staticnonstat y = new Staticnonstat();
		System.out.println("non static value =" +y.b); //40
		
		x.b=65;
		System.out.println("non static value =" +x.b); //65
		System.out.println("non static value =" +y.b); //40
		
		System.out.println("static value with x ref =" +x.a); //50
		System.out.println("static value with y ref =" +y.a); //50
		
		x.a =20;
		System.out.println(" static variable with x ref updated =" + x.a);//20
		System.out.println(" static variable with y ref updated =" + y.a);//20
		
	}
	 
}
