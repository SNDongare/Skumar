package SeleniumPractice;

public class JavaPractice {

	public static void main(String[] args) {
	
//		String SuccessMessage = "Policy No P/AR0224/011 SuccessFully Created";
//
//		String[] allMessage = SuccessMessage.split(" ");
//		
//		System.out.println(allMessage[0].trim());
//		System.out.println(allMessage[1].trim());
//		System.out.println(allMessage[2].trim());
//		System.out.println(allMessage[3].trim());
//		System.out.println(allMessage[4].trim());
//		
//		
//		String policyNumber = allMessage[2].trim();
		
		System.out.println(retrivetext());
		
	}

	public static String retrivetext() {
		String SuccessMessage = "Policy No P/AR0224/011 SuccessFully Created";
		String[] allMessage = SuccessMessage.split(" ");
		String policyNumber = allMessage[2].trim();
		return policyNumber;
	}
	
	

}
