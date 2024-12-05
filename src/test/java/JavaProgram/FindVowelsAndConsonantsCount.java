package JavaProgram;

public class FindVowelsAndConsonantsCount {

	public static void main(String[] args) {
		
		String str = "Today we will learn a sample java programs";
		
		int vCount=0; 
		int cCount=0;
		
		str=str.toLowerCase();
		
		for(int i =0;i<str.length();i++) {
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				cCount++;
			}
		}
		
		System.out.println("The count of Vowels in a string is: "+vCount);
		System.out.println("The count of Consonants in a string is: "+cCount);

	}

}
