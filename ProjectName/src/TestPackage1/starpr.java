package TestPackage1;

public class starpr {
	
	public static void main(String[] args) {
		 
		int star =1;
		
		for (int j=1; j<=5; j++) 
		{
			for(int i=1;i<=star; i++ ) {
				System.out.print("*");
			}
			
			System.out.println();
			star++;
		}
	}

}
