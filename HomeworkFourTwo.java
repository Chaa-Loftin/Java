package firsthomework;
/**************************************** *
* Student Name: Chaa Loftin	
* Date Due: 02/24/19	
* Date Submitted:02/24/19
* Program Name: HomeworkFourTwo
* Program Description: Program prompts the user to enter a hex digit
* and displays its corresponding binary number.
* 
* ****************************************/

import java.util.Scanner;
public class HomeworkFourTwo {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter hex digit
		System.out.println("Enter the hex Digit");
		String hex = input.nextLine();
		
		if (hex.length() != 1) {
			System.out.println("Invalid input, enter a single value");
			System.exit(1);
		}
		
		//display decimal value
		
		char ch = Character.toUpperCase(hex.charAt(0));
		
		//display results with if statements
		
		if(ch <= 'F' && ch >= 'A') {
			int value = ch - 'A' + 10;
			System.out.println("The decimal value of " + ch + " is " + value);
		}
		else if (Character.isDigit(ch)) { 
			System.out.println("The binary form of this value is " + ch);
		}
		else {
			System.out.println("you're input is invalid");
		}
	}

}
