package JavaProgram;

import java.util.HashSet;

public class DuplicatesInAnArray {

	public static void main(String[] args) {


		/*
		 * //Approach 1 By using algorith method String str[]=
		 * {"Java","Python","C++","Java","C#"};
		 * 
		 * boolean flag=false;
		 * 
		 * for(int i=0;i<str.length;i++) {
		 * 
		 * for(int j=i+1;j<str.length;j++) {
		 * 
		 * if(str[i]==str[j]) {
		 * System.out.println("Found Duplicate value in array: "+str[i]); flag=true; } }
		 * 
		 * if(flag==false) { System.out.println("No Duplicate value found in array"); }
		 * }
		 */

		//Appraoch 2 By Using Hashset

		String arr[]= {"Java","Python","C+=+","C++","C#"};

		boolean flag=false;
		
		HashSet <String> lang= new HashSet();
		
		for(String value : arr) {
			
			if(lang.add(value)==false) {
				
				System.out.println("found Dplicate value in array: "+value);
				flag=true;
			}
		}
 
		if (flag==false) {
			System.out.println("No duplicate value found in array");
		}
	}

}
