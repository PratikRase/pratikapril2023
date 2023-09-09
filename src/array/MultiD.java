package array;

public class MultiD {

	public static void main(String[] args) {
		
		int[][] a= {{1,2,3},{1,2,3,4},{1,2,3,4,5}};
		
		System.out.println(a[2][4]);
		System.out.println(a.length);
		System.out.println(a[1].length);

		int[][]b=new int[2][3];
		//1 2 3
		//1 2 3
		b[0][0]=1;
		b[0][1]=2;	
		b[0][2]=3;
	    b[1][0]=1;
	    b[1][1]=2;
	    b[1][2]=3;
	    for (int i = 0; i <= a.length; i++) {
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.println(a[i][j]+",");
			}
			System.out.println();
		}
		
		//sum issue for u
	}

}
