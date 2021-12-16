package JavaInterviewPrograms;

import java.util.Scanner;

public class PrimeNumberList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the start value of the range :: ");
		int start = Integer.parseInt(scan.nextLine().trim());
		System.out.print("Enter the end value of the range :: ");
		int end = Integer.parseInt(scan.nextLine().trim());

		for (int i = start; i <= end; i++) {
			if (checkPrimeNumber(i))
				System.out.println(i + " is a Prime number");
			else
				System.out.println(i + " is not a Prime number");
		}
		scan.close();
	}

	private static boolean checkPrimeNumber(int num) {
		if (num <= 1)
			return false;

		int length = num / 2;
		for (int i = 2; i < length; i++)
			if (num % i == 0)
				return false;
		return true;
	}

}
