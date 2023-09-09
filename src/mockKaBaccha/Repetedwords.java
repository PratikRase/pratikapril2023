package mockKaBaccha;

import java.util.ArrayList;

public class Repetedwords {

	public static void main(String[] args) {
		
		String[] a= {"Pratik","Akshay","Ayesha","Pratik"};
		
		ArrayList al=new ArrayList();
		
		al.add("Pratik");
		al.add("Akshay");
		al.add("Ayesha");
		al.add("Pratik");
		   
           System.out.println(al.remove(0));
           System.out.println(al.contains("Pratik"));
           System.out.println(al);
	}
	
}
