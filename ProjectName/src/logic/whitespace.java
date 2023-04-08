package logic;

public class whitespace {// duplicate character or space given in
	
	public static void main(String[] args) {
		String ar="RSSSBNNKSS M S T";
		
		int total=0;
		
		for (int i=0;i<=ar.length()-1;i++) {
			
			char b=ar.charAt(i);
			//System.out.println(b);//gives as it is
		
			if (b=='S') {
				total++;
			}
		}
		System.out.println(total);
		
	}

}
