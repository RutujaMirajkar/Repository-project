package homework;

public class stringswork {
	
	public static void main(String []args){
		
		String a="velocity";
		String b="class";
		String c="running";	
		String d="ing";
	    String s1="happiness";
	    String s2="love";
	    String s3="  HEALTH";
	    
		
		System.out.println(a.charAt(6));
	   System.out.println(b.replace("s","l"));//replacewith different letter)
	   System.out.println(c.isEmpty());//gives boolen value true or false
	   System.out.println(d.concat(s3));//merges 
	   System.out.println(s1.isBlank());//simillar to boolean
	   System.out.println(s1.substring(3));//first 3or any no we
	     //give leaving that 
	   System.out.println(s3.length());//it gives the length of the input word 
	   System.out.println(c.substring(1, 6));// print from which no. of letter t
	   //till which last latter we have to give that no.of that letter
	   System.out.println(s3.substring(2));
	   System.out.println(s1.trim());//it delets the space at start and the end 
	   //but does not remove the space between the letter or words
	   System.out.println(s1.equalsIgnoreCase(s1));// it gives the boolean values
	   System.out.println(s1.equalsIgnoreCase(s2));//it compares between gives two values
	   System.out.println(s2.toUpperCase());// gives in capital form
	   System.out.println(s3.toLowerCase());// gives in lower case 
	   
	   String r= String.join(s1,s2,s3);
	   
	   System.out.println(r);
	   
	   String t= "ve,loc,ity";// the comma or space used here 
	   //will compare ti the given down .. 
	  
	   String[] result =t.split(",");
	   
	   for(int i=0; i<result.length;i++){
		   
		  // System.out.println("i");
		   
		   System.out.println(result[i]);
	   }
	   
	   
	}
	
	

}
