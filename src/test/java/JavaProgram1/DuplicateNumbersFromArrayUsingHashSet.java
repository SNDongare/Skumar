package JavaProgram1;

import java.util.HashSet;

public class DuplicateNumbersFromArrayUsingHashSet {

	public static void main(String[] args) {

		int num[]= {1,2,3,4,5,5,6,7,8,5,8,6};
		
		HashSet<Integer> seenNumber= new HashSet<>();
		HashSet<Integer> duplicateNumber = new HashSet<>();
		
		for(int currentNumber:num) {
			
			if(seenNumber.add(currentNumber)) {
				seenNumber.add(currentNumber);
			}
			else
			{
				duplicateNumber.add(currentNumber);
			}
		}
		
		System.out.println(seenNumber);
		System.out.println("The Value of duplicate Number is:"+duplicateNumber);
		
		
		
		

	}

}
