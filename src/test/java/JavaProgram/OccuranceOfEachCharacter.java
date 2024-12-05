package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		
		String str="Java";
		
		Map<Character, Integer> cMapCount= new HashMap<>();
		
		for(Character c:str.toCharArray()) {
			
			if(cMapCount.containsKey(c)) {
				cMapCount.put(c, cMapCount.get(c)+1);
			}
			else
			{
				cMapCount.put(c,1);
			}
		}
		
		System.out.println(cMapCount);
	}

}
