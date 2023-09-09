package polymorphism;

public class Methodoverloading {

	public static void main(String[] args) {
		
		 Methodoverloading ab=new Methodoverloading ();
		ab.login(9876543210L," pqrst");
		
	}
		public void login(String a,String b) {
			
			System.out.println("login with username and password");
			
		}
		public void login(long c,String d) {
			
			System.out.println("login with MobileNo and password");
		}
		
		
	}


