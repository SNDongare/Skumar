package JavaProgram1;

import java.util.HashMap;

public class FindEachCharacterAndNoFromString {

	public static void main(String[] args) {
	
		String st="Sachin Navnath Dongare";
		
		String str = st.replaceAll("\\s", "");
		
		HashMap<Character, Integer> charCount= new HashMap<>();
		
		for(char c: str.toCharArray()) {
			
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		
		//Print the na me and no of character by using HashMap
		for(HashMap.Entry<Character, Integer> entry: charCount.entrySet()) {
			
			System.out.print(entry.getKey()+" : "+ entry.getValue()+" , ");
		}
		

	}

}
