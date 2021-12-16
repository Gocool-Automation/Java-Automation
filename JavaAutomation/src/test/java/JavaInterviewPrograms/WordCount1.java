package JavaInterviewPrograms;

import java.util.Scanner;

public class WordCount1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the input string to count the words: ");
		String str = in.nextLine();
		in.close();

		System.out.println("Total words in the given input string is: " + wordCount(str) + "\n");

	}

	public static int wordCount(String str) {

		int count = 0;
		if (!str.isBlank()) {
			if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
				for (int i = 0; i < str.length()-1; i++) {
					if ((str.charAt(i) == ' ') && !(str.charAt(i + 1) == ' ') && !(str.charAt(i + 1) == '\n')
							&& !(str.charAt(i + 1) == '\t'))
						count++;
				}
			}
		} else
			System.out.println("Input String is NULL");

		return count;

	}

}
