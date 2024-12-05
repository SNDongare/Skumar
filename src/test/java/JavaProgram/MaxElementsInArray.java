package JavaProgram;

public class MaxElementsInArray {

	public static void main(String[] args) {
		
		int arr[]= {100,50,30,40,200,20,60,89,90};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>max){
				
				max=arr[i];
				
			}
		}

		System.out.println("The Max value of an array: "+max);
		
	}

}
