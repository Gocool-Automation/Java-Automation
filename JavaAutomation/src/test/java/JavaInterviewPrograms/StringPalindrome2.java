package JavaInterviewPrograms;

public class StringPalindrome2 {

	public static void main(String[] args) {
		System.out.println(checkPalindrome("magam"));
		System.out.println(checkPalindrome("maram"));
		System.out.println(checkPalindrome("madam"));
		System.out.println(checkPalindrome("automation"));

	}

	private static boolean checkPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if(str.equals(rev)) {
			System.out.print(str + " is a Palindrome :: ");
			return true;
		} else {
			System.out.print(str + " is not a Palindrome :: ");
			return false;
		}
	}
	
	

}
