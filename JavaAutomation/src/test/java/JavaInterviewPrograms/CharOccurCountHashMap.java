package JavaInterviewPrograms;

import java.util.HashMap;

public class CharOccurCountHashMap {

	public static void main(String args[]) {
		String instr = "Java J2EE Java JSP J2EE jAVA";
		String str = instr.toLowerCase().replaceAll(" ", "");
		int len = str.length();

		System.out.println("Input String is =" + str);

		HashMap<Character, Integer> CountMap = new HashMap<Character, Integer>();

		for (int i = len - 1; i >= 0; i--) {
			if (CountMap.containsKey(str.charAt(i))) {
				int count = CountMap.get(str.charAt(i));
				CountMap.put(str.charAt(i), ++count);
			} else {
				CountMap.put(str.charAt(i), 1);
			}
		}

		System.out.println("Count of each Character is = " + CountMap);
	}

}
