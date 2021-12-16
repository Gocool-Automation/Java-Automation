package JavaInterviewPrograms.Numbers;

import java.util.HashMap;

public class CharOccurCountHashMap2 {

	public static void charOccurence(String inputString) {
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] chArr = inputString.toLowerCase().replaceAll(" ", "").toCharArray();
		
		//Recursive for loop --requires array as the input
		for (char c : chArr) {
			if (charMap.containsKey(c))
				charMap.put(c, charMap.get(c) + 1);
			else
				charMap.put(c, 1);
		}

		System.out.println("Character Occurence of given String '" + inputString + "' is :: " + charMap);
	}

	public static void main(String[] args) {
		charOccurence("This is Character Occurence Count Java Program");
		charOccurence("SaiMithran Gokulnath Kavitha");
		charOccurence("Kavitha");

	}

}
