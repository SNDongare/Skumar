package JavaProgram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		//Enter one Number
		Scanner scanner =new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int a=scanner.nextInt();

		//Enter second Number
		System.out.println("Enter Second Number: ");
		int	b=scanner.nextInt();

		//Approach 1 By using Third variable
		System.out.println("Value of A Before swap:"+a);
		System.out.println("Value of B Before swap:"+b);

		int t=a;
		a=b;
		b=t;

		System.out.println("Value of A after swap:"+a);
		System.out.println("Value of B after swap:"+b);

	}

//	Approach 2 By using Addition and Substraction 
	@Test
	public void swapByUsingPlusAndMinues() {

		//Enter one Number
		Scanner scanner =new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int a=scanner.nextInt();

		//Enter second Number
		System.out.println("Enter Second Number: ");
		int	b=scanner.nextInt();
		
		//Print Details before the swap Two Number
		System.out.println("Value of A before Swap:-"+a);
		System.out.println("Value of B Before Swap:-"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of A After Swap:-"+a);
		System.out.println("Value of B After Swap:-"+b);
	}
	
//	Approach 3 By using Division and Multiple 
	@Test
	public void swapByUsingDivisionAndMultiple() {

		//Enter one Number
		Scanner scanner =new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int a=scanner.nextInt();

		//Enter second Number
		System.out.println("Enter Second Number: ");
		int	b=scanner.nextInt();
		
		//Print Details before the swap Two Number
		System.out.println("Value of A before Swap:-"+a);
		System.out.println("Value of B Before Swap:-"+b);
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("Value of A After Swap:-"+a);
		System.out.println("Value of B After Swap:-"+b);
	}
}
