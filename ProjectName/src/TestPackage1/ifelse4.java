package TestPackage1;

public class ifelse4 {      //ladderif  age scheme
	
	public static void main(String[] args) {
		
		int rohanage=45, anupage=80;
		
		if(rohanage > anupage) {
		 
			System.out.println("rohan is younger than anup");
		}
		else if(anupage < rohanage) {
			
			System.out.println("anup is elder than rohanage");
			
		}
		else if (rohanage<=50) {
			
			System.out.println("rohan is not elegible for the scheme");
			
		}
		else if (anupage >= 50) {
			
			System.out.println("anup is eligible for scheme");
		}
		
		
	}

}
