package JavaProgram;

import java.util.Arrays;

public class AnagramsOfString {

	public static void main(String[] args) {

		String str1="Brag";
		String str2="Grac";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("The string are not a anagrams");
		}
		else
		{
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			
			//Sort the array
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2)==true) {
				System.out.println("The Strins are anagrams");
			}
			else
			{
				System.out.println("The strings are not a anagrams+++++");
			}
		}

	}

}
