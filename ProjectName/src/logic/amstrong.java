package logic;

public class amstrong {
	public static void main(String[] args) {
		
		int orig=153; //(1^3,5^3,3^3)
		int add=0;
		
		for (int i=orig;i>0;i=i/10) {
			
			int remainder = i%10;//3
			
			add=add+ (remainder*remainder*remainder);
			System.out.println(add);
			}
			
		if (orig==add) {
			System.out.println("is amstrong");
		}
		else {
			System.out.println("is not amstrong");
		}
	}

}
