package JavaInterviewPrograms.Numbers;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		int num = 5;
		fibonacciNumbers(num);
	}

	//Finding the fibonacci series using Iterative while loop 
	public static void fibonacciNumbers(int N) {
		int num1 = 0, num2 = 1;
		int counter = 0;
		
		while(counter< N) {
			System.out.print(num1 + " ");
			
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
			
		}
	}

}
