package JavaInterviewPrograms.Numbers;

import java.util.Scanner;

/*
 * A year is a leap year if −
 * 
 * 1. It is evenly divisible by 100 
 * 2. If it is divisible by 100, then it should also be divisible by 400 
 * 3. Except this, all other years evenly divisible by 4 are leap years.
 */

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Year :: ");
		int year = input.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println(year + " is a Leap Year");
		else
			System.out.println(year + " is not a Leap Year");

		input.close();
	}

}
