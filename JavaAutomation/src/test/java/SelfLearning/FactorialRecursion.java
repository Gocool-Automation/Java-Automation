package SelfLearning;

public class FactorialRecursion {

	public static void main(String[] args) {

		int n = -2;
		System.out.println(findFactorial(n));

	}

	public static int findFactorial(int num) {
		int fact = 0;
		if (num == 0) {
			fact = 1;
		} else if (num > 0) {
			fact = num * findFactorial(num - 1);
		} else
			return -1;
		return fact;

	}

}
