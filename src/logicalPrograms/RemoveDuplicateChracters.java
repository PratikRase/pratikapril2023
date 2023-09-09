package logicalPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChracters {

	public static void main(String[] args) {
		String a="harsh";

		Set<Character> set=new LinkedHashSet();
		
		for(int i=0;i<a.length();i++)
		{
			set.add(a.charAt(i));
		}
		for(Character c:set) {
			System.out.print(c+",");
		}
		
	}

}
