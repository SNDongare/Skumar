package JavaProgram;

public class OccuranceOfSingleCharaacterInString {

	public static void main(String[] args) {
		
		//Find occurance of "a" charcter in string
	
		String str = "Java Programming Java oops a";
		
		//Total count  before removing the "a" Chracter in string
		
		int totalCount = str.length();
		
		//Total count After removing the "a" charcter
		
		int totalCountAfterRemoea = str.replace("a", "").length();
		
		//Total count of occuranc of "a"
		
		int count = totalCount-totalCountAfterRemoea;
		
		
		System.out.println("Total count off a in given string is: "+count);
		

	}

}
