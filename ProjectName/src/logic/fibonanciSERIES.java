package logic;

public class fibonanciSERIES {
	public static void main(String[] args) {
	int  a= 0;
	int b=1;
	
	int total=10;//?? till how many no u want to see these no

	int c ;
	
	System.out.println(a+" "+b); // 0  1
	
	for(int i=0; i< total; i++) {
		c=a+b; //0+1=1  
		
		//i=0is the no we consider in the begining like 
		  //index if we take it 0 then it will not consider the above
		//printed value 0  1 as 0th and 1st it will take it as zeroth
		//and strat  to count from next 0 1(0th) 1(1st),2,3,5,
		
		System.out.println(" "+c);
		
		a=b;//1
		b=c;//1
	}
}
}