package methods;

public class Basic1 {
	  // user define constructor with and without parameter
			
		 int a;
		 int b;
		 int m;
		 String Name;
		 String Velocity;
		 	
		 Basic1(){ // UD constructor without parameter
		 	
		 	a=78;
		 	b=68;
		 	
		 }

		 Basic1(int c, int d,int i){ // UD constructor with parameter
		 	
		 	a=c;
		 	b=d;
		 	m=i;
		 }

		 Basic1(int c,int d){    // UD constructor with parameter
		 	
		 	a=c;
		 	b=d;
		 	
		 }
		 Basic1(String abc, String Testing){
		 	Name= abc;
		 	Velocity= Testing;
		 	
		 	
		 }

		 public void addition() {   // non static method 
		 	System.out.println(m+a+b);
		 	int xyz;
		 	xyz=89;
		 	
		 }

		 public void test() {
		 	System.out.println(Name);
		 	System.out.println(Velocity);
		 }


		 public static void main(String[] args) {
		 	
		 	Basic1 x = new Basic1();
		 	x.test();
		 	x.addition();
		 	x.addition();
		 	
		 	Basic1 y = new Basic1(56,68);
		 	y.addition();
		 	
		 	Basic1 z = new Basic1(10,20,30);
		 	z.addition();
		 	
		 	Basic1 e = new Basic1("PNG","Automation");
		 	e.test();
		 }
		 	
		 	
		 	

		 }


