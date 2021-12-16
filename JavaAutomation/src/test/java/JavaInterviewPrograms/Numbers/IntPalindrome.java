package JavaInterviewPrograms.Numbers;

public class IntPalindrome {

	public static void main(String[] args) {
		
		int n = 12321;
		String reverse = "";
		
		int temp = n;
		while(temp > 0) {
			int rem = temp % 10;
			temp = temp / 10;
			reverse = reverse + rem;
		}
		int reverseN = Integer.parseInt(reverse);
		if(n == reverseN)
			System.out.println(n + " is an Integer Palindrome");
		else
			System.out.println(n + " is not an Integer Palindrome");

	}

}
