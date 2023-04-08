package methods;

public class constructor2 {
	int a;
	int b;
	int c;
String Name;
String ID;

constructor2(){
 a=56;
 b=45;

}


constructor2(int e,int d){
a=e;
b=d;
}
constructor2(int e, int d, int f){
	a=e;
	b=d;
	c=f;
}

public void addition() {
	System.out.println(a+b+c);
}
public static void main (String[] args) {
	constructor2 x = new constructor2();
	
	x. addition();
	
	constructor2 y = new constructor2( 40,50,50);
	y.addition();
	
	constructor2 z = new constructor2(30,50);
	z.addition();
	
}

}


