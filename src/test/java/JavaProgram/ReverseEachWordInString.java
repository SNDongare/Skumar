package JavaProgram;

public class ReverseEachWordInString {

	public static void main(String[] args) {


		String str = "Welcome to java";
		
		//Split this sprint with " "
		
		String[] words = str.split(" ");
		
		String reverseString = "";
		
	//Apprach 1 By using Algorithm method	
		/*for(String w:words) {
			
			String reverseWords = "";
			
			for(int i=w.length()-1;i>=0; i--) {
				reverseWords = reverseWords + w.charAt(i);
			}
			
			reverseString=reverseString+" "+reverseWords;
			
		}
		*/
		
		// By using String builder class
		
		String reverseWord = "";
		for(String w:words) {
			
			StringBuilder sb=new StringBuilder(w);
			
			sb.reverse();
			
			reverseWord= reverseWord+sb.toString()+" ";
		}
		
		System.out.println(reverseWord);
		
		
	}

	
}
