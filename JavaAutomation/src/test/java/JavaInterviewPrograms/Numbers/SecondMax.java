package JavaInterviewPrograms.Numbers;

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		int arr[] = { 10, 32, 34, 54, 19, 29, 38, 45 };

		int max = arr[0];
		int secondmax = arr[1];

		if (max < secondmax) {
			max = arr[1];
			secondmax = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax)
				secondmax = arr[i];
		}

		System.out.println("The given array of values are " + Arrays.toString(arr));
		System.out.println("The Max value of given array is : " + max);
		System.out.println("The Second Max value of given array is : " + secondmax);

	}

}
