/**************************************** *
* Student Name: Chaa Loftin
* Date Due: April 24, 2019
* Date Submitted: April 24, 2019
* Program Name: HomeworkSevenTwo
* Program Description: A program that sorts a String
*
* ****************************************/
package firsthomework;
import java.util.Arrays;
import java.util.Scanner;
public class HomeworkSevenTwo {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
	String s;
		
		System.out.println("Enter a string");
		s = input.nextLine();
		
		
		System.out.println(sort(s));
		
	
		
		
	}
	public static String sort(String s) {
	char c [] = s.toCharArray();
	
	Arrays.sort(c);
	
	return new String(c);
}
}


