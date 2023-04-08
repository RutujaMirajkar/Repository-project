package interfacetesting;

public class Def1 implements Defalt {
	
	

	@Override
	public void show(){
		// TODO Auto-generated method stub
		System.out.println("cycle has peddles");
	}

	public void mart() {
		System.out.println("money");
	}
	
	
public static void main(String[] args) {
		Defalt.xyz();//static
		Def1 u= new Def1();// nonstatic and default
		u.show();
		u.mart();
		
	}
}
