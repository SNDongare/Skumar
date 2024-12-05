package JavaProgram1;

import java.util.LinkedHashSet;
import java.util.Set;

public class OccuranceOfEachChar {

	public static void main(String[] args) {
		/*
		 * String str= "Sachin";
		 * 
		 * char[] ch = str.toCharArray();
		 * 
		 * Map<Character,Integer>map= new HashMap<Character,Integer>();
		 * 
		 * for(char value:ch) {
		 * 
		 * if(map.containsKey(value)) { map.put(value, map.get(value)); } }
		 */
		
		/*
		 * Map<Integer,Integer> map= new HashMap<Integer, Integer>();
		 * 
		 * for(int c:arr) { map.put(c, map.getOrDefault(c, 0)+1); }
		 * System.out.println(map); //map.forEach((k,v) -> System.out.println(k+
		 * "-->"+v));
		 */
		
		/*
		 * int arr[]= {1,2,3,3,4,4,5,5,5,6};
		 * 
		 * int largest=Integer.MIN_VALUE; int secondLargest=Integer.MIN_VALUE;
		 * 
		 * for(int num:arr) {
		 * 
		 * if(num>largest) { secondLargest=largest; largest=num; } else
		 * if(num>secondLargest && num !=largest) { secondLargest=num; } }
		 * 
		 * System.out.println(secondLargest);
		 */
		
		/*
		 * int a1[]= {1,2,3,90}; int a2[]= {4,5,60};
		 * 
		 * int[] merged1 = IntStream.concat(IntStream.of(a1),
		 * IntStream.of(a2)).toArray(); System.out.println(Arrays.toString(merged1));
		 * 
		 * int merged[]= new int[a1.length+a2.length];
		 * 
		 * //Copy first array in to merge array
		 * 
		 * for(int i=0;i<a1.length;i++) { merged[i]=a1[i]; }
		 * 
		 * //Copy second array in to merged array for(int i=0;i<a2.length;i++) {
		 * merged[a1.length+i]=a2[i]; }
		 * 
		 * 
		 * System.out.println(Arrays.toString(merged));
		 */
//		int a1[]= {1,2,3}; 
//		int a2[]= {1,2,7};
		/*
		 * if(a1.length!=a2.length) { System.out.println("Arrays are not equals");
		 * 
		 * } else { boolean status=true; for(int i=0;i<a1.length;i++) { if(a1[i]!=a2[i])
		 * { status = false; break; }
		 * 
		 * } if(status) { System.out.println("Arrays are equals"); }
		 * 
		 * else { System.out.println("Arrays are not equals"); }
		 * 
		 * }
		 */
		
		/*int a1[]= {1,2,3}; 
		int a2[]= {1,2,3};
		
		boolean status = OccuranceOfEachChar.arraysAreEquals(a1, a2);
		
		if(status) {
			System.out.println("Both the arrays are equals");
		}
		else {
			System.out.println("Both the arrays are not equals");
		}
		
		
		
	}
		public static boolean arraysAreEquals(int a[],int b[]) {
			
			//Check both the arrays are null
			if(a==null && b==null) {
				return true;
			}
			
			//Check the one array is null or not
			
			if(a==null || b==null) {
				return false;
			}
			
			//check the length of both the arrays
			if(a.length!=b.length) {
				return false;
			}
			
			//Compare element one by one
			
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					return false;
				}
			}
			
			return true;
			
		}
			
		*/
		
		
		//Find the first not repeating character
		/*
		 * String str= "swis";
		 * 
		 * Map<Character, Integer> map= new HashMap<Character, Integer>();
		 * 
		 * for(char c:str.toCharArray()) {
		 * 
		 * map.put(c, map.getOrDefault(c, 0)+1); }
		 * 
		 * for(Map.Entry<Character, Integer> entry:map.entrySet()) {
		 * 
		 * if(entry.getValue()==1) {
		 * System.out.println("First non repeated char:- "+entry.getKey()); break; } }
		 */
		
		
		//Find duplicate character in string
		String str= "ssscsaaaabb";
		Set<Character> set= new LinkedHashSet<Character>();
		
		for(char c:str.toCharArray()) 
			set.add(c);
			StringBuilder result= new StringBuilder();
			
			for(char b:set) 
				result.append(b);
			
			
		
		System.out.println(result);
		
		
		
	}

}
