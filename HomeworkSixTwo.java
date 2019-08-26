
/**************************************** *
* Student Name: Chaa Loftin
* Date Due: 04/10/19
* Date Submitted: 04/10/19
* Program Name: HomeworkSixTwo
* Program Description: This program counts the number of occurrences of a specific
* character in a word
*
* ****************************************/

package firsthomework;

import java.util.Scanner;
public class HomeworkSixTwo {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		
		System.out.println("Enter a character ");
		char a = input.next().charAt(0);
		
		System.out.println("The character " + a + " occurs " + count(str, a) + " times");
		
		
	}
	//create a method to count the number of occurrences of the char.
public static int count(String str, char a) {
	
	int count = 0;
	
	for ( int i = 0; i < str.length(); i++)
		if (str.charAt(i) == a)
			count++;
			
			return count;
}

}

