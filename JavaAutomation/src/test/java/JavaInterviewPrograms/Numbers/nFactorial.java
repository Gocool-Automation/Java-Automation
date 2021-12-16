package JavaInterviewPrograms.Numbers;

import java.util.Scanner;

public class nFactorial {

	public static void main(String[] args) {
		System.out.print("Enter any Integer number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		System.out.println("Factorial of " + num + " is :: " + factorial(num));
	}
	
	public static int factorial(int n) {
		final int fact;
		if(n==0)
			fact = 1;
		else
			fact = n * factorial(n-1);
		return fact;
	}

}
