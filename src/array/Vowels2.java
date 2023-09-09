package array;

public class Vowels2 {

	public static void main(String[] args) {
		
		String[] a={"Ashish","Aditty","Manjiri","Ankita"};
		int vowels=0;
		
		for (int i = 0; i < a.length; i++) {
			
			char ch=(char) a.length;
			
			if(ch=='a'||ch=='A'||ch=='e'|| ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			vowels++;
		}}
			
			System.out.println("count of vowels is"+vowels);
	}

}
