package interfacetesting;

public class XYZ implements ABC,DEF{
	
	public void memo() {
		
		System.out.println("memo exist in both the class");
	}
	
	public void demo() {
		int a=100;
		int b=40;
		int c=a+b;
		System.out.println(c);
		System.out.println("demo exist in first class ");
		
	}
	
	public void Hard() {
		System.out.println("hard exist in second class");
		
	}
   
	public void Basic() {
		System.out.println("basic exist in second ");
		
	}
	//public static void main(String[] args) {
	//	XYZ m=new XYZ();
	//    m.Basic();
	//    m.demo();
	//    m.Hard();
	//    m.memo();
	
	//}
}
