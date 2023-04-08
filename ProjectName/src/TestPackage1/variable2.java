package TestPackage1;

public class variable2 {
	public static void main (String[] args) {
		boolean stdpass=false; //conditional DT only TRUE or FALSE output
		byte stdmarks=100;    //value from -128 to 127 use byte insted of in to save 
		short totalmarks=500;  // value from -32768 to 32768
		int rollnumber=6744;  // greater than short DT range 
		long mobilenumber=9970583436L;  //L is mandatory when we use long
		double stdavgmarks=567.787778889999966; //fractional upto 15 digit
		float stdpercentage=78.98f; //f is mandatory in float
		char stdGrade='A';
		
		System.out.println(stdpass);
		System.out.println(stdmarks);
		System.out.println(totalmarks);
		System.out.println(rollnumber);
		System.out.println(mobilenumber);
		System.out.println(stdavgmarks);
		System.out.println(stdpercentage);
		System.out.println(stdGrade);
	}
	

}
