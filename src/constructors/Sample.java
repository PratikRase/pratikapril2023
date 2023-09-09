package constructors;

public class Sample {
	
	int a=60;
	public Sample() {
		System.out.println("hi");
	}
	public Sample(int i)
	{		
	i=a;
		System.out.println(a);
	}
	public Sample(int b,int c) {
		
		
		int sum= b+c;
		System.out.println(sum);
		
	}
		
	public static void main(String[] args) {
		
		Sample obj1= new Sample();
		
		Sample obj2 = new Sample(60);
		
		Sample obj3= new Sample(20,30);
		
		
		

	}

}
