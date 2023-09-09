package abstraction;

public class GrandChild extends Child {

	
public void method4() {
		
		System.out.println("method4");
}
	
	public void method2() {
		
		System.out.println("method2");
	}

	public static void main(String[] args) {
		GrandChild ab=new GrandChild();
		ab.method1();
		ab.method2();
		ab.method3();
		ab.method4();
		
		
	}
	
	
	
	
	
	
}
