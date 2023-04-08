package homework;

public  class callabstrc extends abstr {
	
	public void aman() {
		System.out.println("implement");
		
	}
	
	public void Test() {
		System.out.println("reentered");
	}
	
	public static void main(String[] args) {
		callabstrc x =new callabstrc();
		x.aman();
		x.Test();
	}

}
