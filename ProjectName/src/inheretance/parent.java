package inheretance;

public class parent {
	 
	 static void main () {
		 System.out.println("we call static method");
	 }
	 
	 static String info="first time call string datatype";
     static int a;
     static int b;
     static int c;
     
     parent(){
    	 a=23;
    	 b=34;
     }
     parent(int e,int d){
    	a=e;
    	b=d;
     }
     parent(int f,int g,int k){
    	 a=f;
    	 b=g;
    	 c=k;
     }
	void add() {	
	System.out.println(a+b+c);
	}
	
}

