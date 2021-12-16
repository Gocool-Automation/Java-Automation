package JavaInterviewPrograms.Numbers;

import java.util.Arrays;
import java.util.Collections;

public class SortAscending {
	//Sorting array using Java Util Sort Array package

	public static void main(String[] args) {
		int[] array = {2,5,12,1,109, 54, 86,142};
		
		Arrays.sort(array);
		
		System.out.println("Ascending order sorted Array values are: ");
		
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
