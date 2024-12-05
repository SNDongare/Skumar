package JavaProgram;

public class ExtractEvenOddNumFromArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,9,13};

		//Approach 1 By using For loop
		//Extracting Even numbers from Array
		
		
		/*
		 * System.out.println("Extracting Even Number from array:"); for(int
		 * i=0;i<a.length;i++) {
		 * 
		 * if(a[i]%2==0) { System.out.println(a[i]); }
		 * 
		 * }
		 * 
		 * //Extracting Odd numbers from Array
		 * System.out.println("Extracting Odd Number from array:"); for(int
		 * i=0;i<=a.length-1;i++) { if(a[i]%2!=0) { System.out.println(a[i]); } }
		 */
		 
		 //Apprach 2 By Using For Each loop(Enhance for loop)
		
	System.out.println("Extracting the Odd Number from the Array");
	for(int value:a) {
		 if(value%2==0) 
			 System.out.println(value);
		 
	}

	System.out.println("Extracting the Odd Number from the Array");
	for(int value:a) {
		 if(value%2!=0) 
			 System.out.println(value);
		 
	}
	}}
