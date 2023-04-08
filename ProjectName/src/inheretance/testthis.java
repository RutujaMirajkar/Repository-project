package inheretance;

public class testthis extends child1 {
	int c =58;
	
	public void test(){
		int c=90;
	
	//public static void main(String [] args);	
	
		
	
 System.out.println(c);
 System.out.println(this.c);
	//System.out.println(super.home);
	}
public static void main(String[] args) {
	
	testthis m=new testthis();
	m.test();
	
}






}
