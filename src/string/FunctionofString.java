package string;

public class FunctionofString {

	public static void main(String[] args) {
		
		String s1="Aspire";
		String s2="aspire";
		String s3="ASPIRE";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toLowerCase());
		
		System.out.println(s1.length());
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		

	}

}
