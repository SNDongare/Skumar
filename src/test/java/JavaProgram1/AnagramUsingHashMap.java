package JavaProgram1;

import java.util.HashMap;

public class AnagramUsingHashMap {

	public static void main(String[] args) {

		String s="JAVA";
		String p="AVAJ";


		HashMap<Character, Integer> map1 = new HashMap<>();	
		HashMap<Character, Integer> map2 = new HashMap<>();

		for(int i=0;i< s.length();i++) {
			char key = s.charAt(i);

			map1.put(key, map1.getOrDefault(key, 0)+1);
		}

		for(int i=0;i<p.length();i++) {
			char key = p.charAt(i);

			map2.put(key, map2.getOrDefault(key, 0)+1);
		}

		if(map1.equals(map2)) {
			System.out.println("Both strings are anagram");
		}
		else
		{
			System.out.println("Both strings are not anagram");
		}

		for(HashMap.Entry<Character, Integer> entry :map1.entrySet()) {

			System.out.println(entry.getKey()+ " : "+entry.getValue());
		}

		for(HashMap.Entry<Character, Integer> entry :map2.entrySet()) {

			System.out.println(entry.getKey()+ " : "+entry.getValue());
		}
	}


}
