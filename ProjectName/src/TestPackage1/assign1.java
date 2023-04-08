package TestPackage1;

public class assign1 {
	public static void main(String[] args) {
		
	int space= 5;
	int star=1;	
	
	for (int i=1;i<=11;i++) { // for row no. 11 rows total
		 
	for(int j=1; j<=space;j++){ /// space start form start add on later j++
			
			System.out.print(" "); // print space 
		}
		
	for (int k=1;k<=star;k++)  // star print condition
			
			System.out.print("*");
			System.out.println(); // next line   what to do in next line
			                       // given in if condition  till i<=5
			                       // else after 5 rows goes to space--
			                       // and after loop proved from first print
		
		if (i<=5) {	
			
			space--;
			star=star+2;
		}
		else {
			space ++;
			star=star-2;
		}
			
			
		
			
		}
		
		
	
	
		
		
	
}

}
