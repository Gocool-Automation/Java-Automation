package JavaInterviewPrograms.Numbers;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3, 6, 4, 8, 9, 7, 6, 7 };

		System.out.println("Duplicate values in the given array are :: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}
