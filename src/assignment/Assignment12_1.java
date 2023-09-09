package assignment;

public class Assignment12_1 {

	public static void main(String[] args) {
		String s1="Pramod";
		String[] sar =s1.split("");
			String rev="";
			for (int i = sar.length-1; i >=0 ; i--) {
				rev=rev+sar[i];
			}
             System.out.println(rev);
	
		     String s2="harsh";
		System.out.println(s2.substring(2));
	}

}
