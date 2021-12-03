package InterviewPrep;

public class SortDescending {

	public static void main(String[] args) {
		// Sorting numbers using user defined methods

		int[] arr = { 5, 2, 8, 7, 1, 0 };
		int temp;

		System.out.println("Elements before sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();
		System.out.println("Elements after sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
