package array;

public class VowelsCount {

	public static void main(String[] args) {
		
		String a="maulik";
		int vowels=0;
		
		for (int i = 0; i < a.length(); i++) {
			
			char ch=a.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowels++;
		}}
			
			System.out.println("count of vowels is"+vowels);
		
		
		
		
		
		

	}

}
