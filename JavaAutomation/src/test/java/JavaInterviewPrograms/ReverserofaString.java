package JavaInterviewPrograms;

import java.util.Scanner;

public class ReverserofaString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a String:: ");
		String str = s.nextLine();
		s.close();
		System.out.println("Reverse of the String is = " + StrReverse(str));
		

	}
	
	public static String StrReverse(String s) {
		String rev = "";
		for(int i=s.length(); i>0;i--) {
			rev = rev+(s.charAt(i-1));
			System.out.print(s.charAt(i-1));
		}
		System.out.println();
		return rev;
		
	}

}
