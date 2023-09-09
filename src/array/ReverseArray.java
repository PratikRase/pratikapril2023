package array;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {7,6,3,7,9,8};
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]+",");
		}
		
		System.out.println();
		for (int j = a.length-1; j>=0; j--) {
			System.out.print(a[j]+",");
		}
		
		
	}

}
