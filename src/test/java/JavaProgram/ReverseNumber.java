package JavaProgram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseNumber {

	@Test(priority=1)
	void ReverseNumberUsingLogic() {	
		System.out.println("Enter the Number: ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int reverseNum = 0;
		
		while(num!=0) {
			
			//Get the last digit of number
			int digit = num % 10;
			
			//Append the digit to the number
			reverseNum = reverseNum * 10 + digit;
			
			//Remove the last digit from number
			
			num = num / 10;
			
			
		}
		
		System.out.println("Reversed Number "+reverseNum);

	}
	
	@Test(priority=2)
	public void reverseNumberUsingStringBuffer() {
		
		System.out.println("Enter the Number: ");
		Scanner scanner = new Scanner(System.in);
		
		 String num = scanner.nextLine();
		
		StringBuffer sb=new StringBuffer(num);//String Buffer Class
		
		//Reverese Number by using the reverse  num
		sb.reverse();
		
		//Out put of this is in Strin format so convert it int Integer By using Wrapper class.
		 int reverseNum = Integer.parseInt(sb.toString());
		 
//		String reverseNum = sb.toString();
		 
		
		 System.out.println("Reversed Bumber Is:"+reverseNum);

	}

	@Test(priority=3)
	public void reverseNumberUsingStringBuilderClass() {
		
		System.out.println("Enter the Number: ");
		Scanner scanner = new Scanner(System.in);
		
		  int num = scanner.nextInt();
		 
		String NumString = Integer.toString(num);//Convert number Int to String
		
		//Create the Class for the String Builder
		StringBuilder sbr=new StringBuilder(NumString);
		
		//Reverse Num/String Using the Reverse Method
		sbr.reverse();
		
		String reversedNum = sbr.toString();//Convert It in to String
		
		System.out.println("Reversed Number/String:"+reversedNum);
		
		
		
		
	}
}
