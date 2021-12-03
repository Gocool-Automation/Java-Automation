package CoreJavaBasics;

public class JavaBasics3 {

	public static void main(String[] args) {
		
		//String as an Object  //String Literal
		String s = "Rahul Shetty Academy";
		//String s1 = "Rahul Shetty Academy";
		
		//String with new object keyword
		String s2 = new String("Hello World");
		String s3 = new String("Hello World");
		
		//Interview Question:
		//Difference between String literal vs String with new keyword - String literal "s" and "s1" will not create a new object when the value for the string literal is same
		//whereas String with new keyword will create a new object memory even though the String values are same.

		//String operations
		String[] splitString = s.split(" ");
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		System.out.println(splitString[2]);
		
		String[] splitString2 = s.split("Shetty");
		System.out.println(splitString2[0]);
		System.out.println(splitString2[1]);
		System.out.println(splitString2[1].trim());
		
		//String is also a array of Character/Integer
		//Printing String in forward by characters
		for(int i = 0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//Printing String in reverse by characters
		for(int i = s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
				
	}

}
