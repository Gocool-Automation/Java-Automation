package InterviewPrep;

public class StringPalindrome {

	public static void main(String[] args) {
		String[] words = new String[] { "madam", "malayalam", "radar", "java", "automation" };
		for (String word : words) {
			System.out.print("The Given String |" + word + "| ");
			if (checkPalindrome(word))
				System.out.println("is a Palindrome");
			else
				System.out.println("is not a Palindrome");
		}

	}

	private static boolean checkPalindrome(String word) {
		int strLen = word.length();
		for (int i = 0; i < word.length() / 2; i++)
			if (word.charAt(i) != word.charAt(strLen - i - 1))
				return false;
		return true;
	}

}
