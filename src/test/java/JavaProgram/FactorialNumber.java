package JavaProgram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FactorialNumber {

	@Test
	public void factorialNumber() {
		
		//Create the scanner class for the same to take input value at the run time
		Scanner scanner=new Scanner(System.in);
		
		//Enter the Number
		System.out.println("Enter the Number to calculate the Factorial:-");
		int num = scanner.nextInt();
		long factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		
		System.out.println("Factorial Value is:-"+factorial);
		
		
	}
}
