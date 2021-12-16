package JavaInterviewPrograms.Numbers;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		System.out.println("Given array values before sorting " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Given array values after sorting " + Arrays.toString(arr));
	}

	private static void bubbleSort(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
