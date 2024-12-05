package JavaProgram;

import java.util.Scanner;

public class CountNoOfWordsInString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String: ");
		
		Scanner sc=new Scanner(System.in);
		
		//Eg- Welcome To Automation Testing
		String str = sc.nextLine();
		
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
				
				count++;
			}
		}
		
		System.out.println("The No of word in a string is: "+count);
	}

}
