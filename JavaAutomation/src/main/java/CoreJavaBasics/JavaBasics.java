package CoreJavaBasics;

public class JavaBasics {

	public static void main(String[] args) {

		int myNum = 5;
		String website = "www.google.com";
		char letter = 'g';
		double dec = 5.75;
		boolean result = true;

		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println(website);
		
		//Arrays in Java
		//Array of Integer
		int[] arrNum1 = new int[5];
		arrNum1[0] = 1;
		arrNum1[1] = 2;
		arrNum1[2] = 3;
		arrNum1[3] = 4;
		arrNum1[4] = 5;
		
		int[] arrNum2 = {6,7,8,9,10,11,12,13,14,15};
		
		//System.out.println(arrNum1[1] + arrNum2[1]);
		
		//For Loop
		for(int i = 0; i < arrNum1.length; i++) 
		{
			System.out.println(arrNum1[i]);
		}
		
		for(int i = 0; i < arrNum2.length; i++)
		{
			System.out.println(arrNum2[i]);
		}
		
		//Array of String
		String[] name = {"Gokulnath", "Kavitha", "SaiMithran"};
		
		for(int i= 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//Enhanced For Loop
		for (String s: name)
		{
			System.out.println(s);
		}
	}

}
