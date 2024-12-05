package JavaProgram1;

import java.util.HashSet;

public class FindMultipleMissingNumberInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,5,6,7,9,10,14};
		
		findMissingNumbers(arr);

	}
	
	public static void findMissingNumbers(int arr[]) {
		
		int min=arr[0];
		int max=arr[0];
		
		for(int num:arr) {
			
			if(num<min) {
				min=num;
			}
			if(num>max) {
				max=num;
			}
		}
		
		//create set off full range
		
		HashSet<Integer> fullRange= new HashSet<>();
		
		for(int i=min; i<=max;i++) {
			fullRange.add(i);
		}
		
		//Remove all numbers present in the array from set
		
		for(int num : arr) {
			fullRange.remove(num);
		}
		
		//Remaining numbers are the missing numbers
		
		System.out.println("The Missing numbers are the : "+fullRange);
	
	}

}
