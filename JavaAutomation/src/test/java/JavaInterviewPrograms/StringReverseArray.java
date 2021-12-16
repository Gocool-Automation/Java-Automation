package JavaInterviewPrograms;

import java.util.Scanner;

public class StringReverseArray {

	public static void main(String[] args) {

		// Convert the input String into Char Array and print the Char array in reverse
		System.out.print("Enter a String value = ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		char[] ch = str.toCharArray();

		System.out.print("Reverse of the String is = ");
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
