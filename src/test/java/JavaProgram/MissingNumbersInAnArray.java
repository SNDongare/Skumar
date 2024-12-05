package JavaProgram;

public class MissingNumbersInAnArray {

	public static void main(String[] args) {
		
		//Preconditions
		//No duplicate values in array
		//Array no need to in sorted order
		//values shpuld be in range(Min and max value)
		
		int a[]= {1,2,4,5};
		
		int sum1=0;
		int sum2 =0;
		
		for(int i=0;i<a.length;i++) {
			
			sum1=sum1+a[i];
		}

		System.out.println("The sum of Elements "+sum1);
		
		//Sum of the array of range
		
		for(int i=1;i<=5;i++) {
			sum2=sum2+i;
		}

		System.out.println("The sum of array range is "+sum2);
		System.out.println(sum2-sum1);
	}
	
	
}
