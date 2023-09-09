package logicalPrograms;

public class FindDuplicatesElements {

	public static void main(String[] args) {
		String arr[]= {"Maulik","Umesh","Saroj","Umesh","saroj","pratik","pratik"};

		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			
			}	
				
		}
		
		
		
	}

}
