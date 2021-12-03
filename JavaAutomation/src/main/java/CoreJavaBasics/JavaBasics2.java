package CoreJavaBasics;

import java.util.ArrayList;

public class JavaBasics2 {

	public static void main(String[] args) {
		
		//Array - Static storage
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 111 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is multiple of 2");
				break;
			}
			else
				System.out.println(arr[i] + " is not multiple of 2");
		}
		
		//ArrayList - Dynamic storage
		ArrayList numList = new ArrayList(); //Store Integer
		ArrayList<String> strList = new ArrayList<String>(); //Store String
		
		strList.add("SaiMithran");
		strList.add("Kavitha");
		strList.add("Gokulnath");
		
		
		System.out.println(strList.get(2));
		

	}

}
