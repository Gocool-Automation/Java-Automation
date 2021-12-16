package JavaInterviewPrograms.Numbers;

public class CharCount {

	public static void main(String[] args) {
		String str = "Counting total characters in the String 123456";
		int charCount = 0;
		int letterCount = 0;
		
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				charCount = charCount + 1;
				if(Character.isLetter(str.charAt(i)))
					letterCount = letterCount + 1;
			}
		}
		
		System.out.println("Total count of Characters in the String is :: " + charCount);
		System.out.println("Total count of Letters in the String is :: " + letterCount);

	}

}
