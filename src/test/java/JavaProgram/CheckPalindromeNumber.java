package JavaProgram;
import java.util.Scanner;

import org.testng.annotations.Test;

public class CheckPalindromeNumber {

	//By using the Logic
    @Test
    public void checkPalindromeNumber() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Number to check if it's a Palindrome Number:");
        
        int number = scanner.nextInt();
        int originalNumber = number;
        int reverseNum = 0;

        // Use while loop and logic to reverse the number
        while (number != 0) {
            // Remove the last digit
            int digit = number % 10;
            
            // Append the digit
            reverseNum = reverseNum * 10 + digit;
            
            // Remove the last digit
            number = number / 10;
        }
        
        // Compare the original number with the reversed number
        if (originalNumber == reverseNum) {
            System.out.println("Number is a palindrome: " + reverseNum);
          
        } else {
            System.out.println("Number is not a palindrome");
           
        }
    }
    
    //Approach 2 By using String Buffer class using NextInt Method
    @Test
    public void CheckPalindromeUsingStringBufferClass() {
    	 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Number to check if it's a Palindrome Number:");
        
        int number = scanner.nextInt();
        
        StringBuffer sb=new StringBuffer(Integer.toString(number));
        
        sb.reverse();
        
      int reverseNum = Integer.parseInt(sb.toString());
      
      System.out.println("Reversed Number:-"+reverseNum);
      
      if (number == reverseNum) {
      	System.out.println("Number is a Palindrome Number:-"+reverseNum);
      }
      else {
    	  System.out.println("Number is not a Palindrome");
      }
    }
    
  //Approach 2 By using String Buffer class with NextLine Method
    @Test
    public void CheckPalindromeUsingStringBufferClass1() {
    	 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Number to check if it's a Palindrome Number:");
        
         String number = scanner.nextLine();
        
        StringBuffer sb=new StringBuffer(number);
        
        sb.reverse();
        
      String reverseNum = sb.toString();
      
      System.out.println("Reversed Number:-"+reverseNum);
      
      if (number.equals(reverseNum)) {
      	System.out.println("Number is a Palindrome Number:-"+reverseNum);
      }
      else {
    	  System.out.println("Number is not a Palindrome");
      }
    }
    
   
}
