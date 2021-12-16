package JavaInterviewPrograms.Numbers;

import java.util.Scanner;

/*
Prime number is a number that is greater than 1 and divided by 1 or itself only. 
In other words, prime numbers can't be divided by other numbers than itself or 1. 
For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
*/

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the input number :: ");
		int num = Integer.parseInt(scan.nextLine().trim());
		boolean result = checkPrimeNumber(num);
		if (result == true)
			System.out.println("Given number is a Prime number");
		else
			System.out.println("Given number is not a Prime number");
		scan.close();

	}

	private static boolean checkPrimeNumber(int num) {
		if (num <= 1)
			return false;

		int length = num / 2;

		for (int i = 2; i < length; i++) {
			if (num % i == 0)
				return false;

		}
		return true;
	}

}
