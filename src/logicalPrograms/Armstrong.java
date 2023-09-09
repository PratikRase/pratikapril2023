package logicalPrograms;
//153=1*1*1+5*5*5+3*3*3
public class Armstrong {

	public static void main(String[] args) {
		
		int a=153;
		int rem;
		int arm=0;
		int n=0;
		n=a;
        while(a>0) {
        	rem=a%10;
        	arm=(rem*rem*rem)+arm;
        	a=a/10;      	
        }
        	if(n==arm) {
        		System.out.println("arm num");
        	}
        	else {
        		System.out.println("not arm num ");
        	}
        		
        	
        	
	}

}
