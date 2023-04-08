package homework;

public class overriddetheload extends overloadinghw {
	
	
		public void run() {
			System.out.println("overload run "); 
		}
		
		public static void walk() {
			System.out.println("success overridding");
		}
	
  public static void main(String[] args) {
           overloadinghw u=new overloadinghw();
           u.run();
           u.run(90);
           u.walk();
           u.walk(90, 80);
           
           overriddetheload o=new overriddetheload();
           o.run();
           o.run(0);
           o.walk();
           o.walk(90, 36);
           
           
}
}


