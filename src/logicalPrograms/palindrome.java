package logicalPrograms;

public class palindrome {

	public static void main(String[] args) {
	
		String s="121";
		String rev="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev))
			System.out.println("yes");
		else
			System.out.print("no");
	}

}
