package JavaProgram;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

//		Apprach1 By using the Replace all method and regular expression

		/*String str="Welcome To Automatin Testing";
		System.out.println("String Before removing White spaces :"+str);

		//REmove white spaces wsing regular expression

		str=str.replaceAll("\\s", "");
		
		//Replace all method is used to remove all the white spaces in string
		
		System.out.println("String After removing white spaces: "+str);

	}
	*/
	
//		Apprach2 By using the replace method without regular expression
	String str="Welcome To Automatin Testing";
	System.out.println("String Before removing White spaces :"+str);

	//REmove white spaces wsing regular expression

	str=str.replace(" ", "");
	
	//Replace all method is used to remove all the white spaces in string
	
	System.out.println("String After removing white spaces: "+str);
}
}