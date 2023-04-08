package inheretance;

public class child2 extends child1{
	public void money() {
		System.out.println("money");
	}
	public static void main(String[] args) {
		child2 y=new child2();
		y.home();
		y.money();
		y.bike();
		y.car();
	}

}
