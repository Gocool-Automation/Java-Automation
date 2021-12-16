package JavaInterviewPrograms;

public class FibonacciSeries2 {

	//Fibonnaci Numbers using Recursive methods
	public static void main(String[] args) {
		
		int N = 5;
		for(int i = 0; i < N; i++) {
			System.out.print(fib(i) + " ");
		}

	}
	
	public static int fib(int n) {
		if(n <=1)
			return n;
		
		return fib(n-1) + fib(n-2);
	}

}
