package JavaProgram;

import java.util.Scanner;

public class FindSqrtOfNumber {

	public static void main(String[] args) {


		System.out.println("Enter the Number");

		Scanner sc=new Scanner(System.in);	

		int num = sc.nextInt();

		//Approach 1 By using Squrt Method

		/*
		 * double sqrt = Math.sqrt(num);
		 * 
		 * System.out.println("The SquareRoot of the given Number is: "+sqrt);
		 * 
		 */
		
		
		//Approach 2 without sqrt method
		
		double temp;
		
		double sqr=num/2;
		
		do {
			temp=sqr;
			sqr=((temp+(num/temp))/2);
		}
		while((temp-sqr)!=0) ;
		
		System.out.println("The sqrt of the given number is : "+sqr);
		}
	}


