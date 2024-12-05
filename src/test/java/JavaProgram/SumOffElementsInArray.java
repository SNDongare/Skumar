package JavaProgram;

public class SumOffElementsInArray {

	public static void main(String[] args) {

		//Approac1
		/*int a[]= {5,6,8,9,4};

		int sum=0;

		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}

		System.out.println("The Sum off array is:"+sum);
	}*/


		//Approach 2 
		/*int a[]= {5,6,8,9,4};

		int sum=0;

		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}

		System.out.println("The Sum off array is:"+sum);
	}*/
	
	//Approach 3 (By Using Enhance for Loop(For each Loop)
		
		
		int a[]= {5,6,8,9,4};
		int sum=0;
		for(int value:a) {
			
			 sum = sum+value;
			
		}
		System.out.println("The sum off array value is using For each loop:"+sum);
		
}
}