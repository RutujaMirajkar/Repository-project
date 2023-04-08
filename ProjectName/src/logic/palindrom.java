package logic;

public class palindrom {// reverse of the string input but it should
	//pronounce same as that of the string
	
    public static void main(String[] args) {
		
    	String A="RADAR";
    	String reverse="";
    	
    for (int i=A.length()-1; i>=0; i--){
    	//System.out.println("i");
    	
    	reverse= reverse +  A.charAt(i);// char at returns the 
    	//character at the specific index
    }
    System.out.println(reverse);
    
    if (A.equals(reverse)) {
    	System.out.println("Given output is palandrome");
    }
    else {
    	
    	System.out.println("Given word is not palandrome");
    }
    
    
	}

}
