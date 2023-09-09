package array;

public class OneDArray {

	public static void main(String[] args) {
		
		int[] a= {4,6,5,3,7,8,9,6,4,3,2,7,8};
		System.out.println(a[0]);
		System.out.println(a[5]);
		System.out.println(a.length);
		System.out.println(a[a.length-1]);
		
		int[]b=new int[5];
		b[0]=2;
		b[1]=5;
		b[2]=7;
		b[3]=4;
		b[4]=6;
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.print(b[i]+", ");
			
		}
		

	}

}
