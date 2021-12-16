package JavaInterviewPrograms;

import java.util.Scanner;

public class NumSorting {
	
	//Sorting 3 number without for loop or array
	public static void main(String[] args) {
		
		System.out.print("Enter 3 numbers :  ");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		input.close();
		int temp;
		if(number1 > number2) {
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		if(number2 > number3) {
			temp = number2;
			number2 = number3;
			number3 = temp;
		}
		
		if(number1 > number2) {
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
				
		System.out.println("The sorter numbers are " + number1 + " " + number2 + " " + number3);

	}

}
