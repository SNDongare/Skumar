package JavaProgram1;

import java.util.HashMap;

public class FindNoCoundFromIntArray {

	public static void main(String[] args) {
		
		int num[]= {10, 20, 30, 10, 50, 20, 30};
		
		//Crreate the object of HashMap to store the data in key value pair
		
		HashMap<Integer ,Integer> numCount= new HashMap<>();
		
		for(int c:num) {
			
			numCount.put(c, numCount.getOrDefault(c, 0)+1);
		}

		for(HashMap.Entry<Integer ,Integer> sd:numCount.entrySet()) {
			System.out.println(sd.getKey()+ " : "+sd.getValue());
		}
	}

}
