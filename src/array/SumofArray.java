package array;

public class SumofArray {

	public static void main(String[] args) {
		int a[]= {7,6,3,7,9,8};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]+",");
			sum=sum+a[i];
		}
		System.out.println();
		System.out.println(sum);
	}

}
