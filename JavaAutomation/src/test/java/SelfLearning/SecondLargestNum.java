package SelfLearning;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] array = {10, 5, 8, 20};
		
		for(int i = 0; i<array.length-1; i++) {
			for(int j = 0; j<array.length-i-1; j++) {
				if(array[j]<array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("First Highest value in array is "+ array[0]);
		System.out.println("Seconnd Highest value in array is "+ array[1]);

	}

}
