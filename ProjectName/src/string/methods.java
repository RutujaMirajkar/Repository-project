package string;

public class methods {
	public static void main(String[] args) {
	
		String s1= "Rutujamirajkar";
		String s2="velocity";
		String s4=" velocity ";
		String s3="1234";
		
		System.out.println(s1.charAt(6));// print given no letter as
		//per index
		System.out.println(s1.concat(s3));
		//adds the both value
		
		System.out.println(s2.contains(s4));
		// check if string contains 
		//sequence of character of other string i,e s1=s2 true/ s1!=s2 false
		
		System.out.println(s3.isEmpty());
		//boolean it shows string is iven or not 
		
		System.out.println(s2.replace("v", "m"));
		//replace old value with newone
		
		System.out.println(s2.endsWith("ty"));
		//boolean if its true or false
		
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.length());// length 
		System.out.println(s2.equals(s4));// boolen if same
		System.out.println(s4.trim());// remove white space from both end
        System.out.println(s4.startsWith("R"));		
        System.out.println();		
        System.out.println(s1.substring(1, 3));	
        //?
        // value at place of given string 1stplace asper index=2  3rd place=3,	
        System.out.println();		
        System.out.println();		
        System.out.println();		
	}

}
