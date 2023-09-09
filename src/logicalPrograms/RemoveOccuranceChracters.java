package logicalPrograms;

public class RemoveOccuranceChracters {

	 public static void removeChar(String word, char ch) {
	        word = word.replace(Character.toString(ch), "");
	        System.out.println(word);
	    }
	 
	    // Driver code
	    public static void main(String[] args) {
	        String word = "harsh";
	        removeChar(word, 'h');
		

	}

}
