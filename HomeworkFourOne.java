package firsthomework;

/**************************************** *
* Student Name: Chaa Loftin	
* Date Due: 02/24/19	
* Date Submitted:02/24/19
* Program Name: HomeworkFourOne
* Program Description:Asks the user for two different variables
* then displays the area of a polygon
* ****************************************/

import java.util.Scanner;
public class HomeworkFourOne {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the characters : ");
		String s = input.nextLine();
		
		int k = s.length();
		
		while (k>0) {
			System.out.print(s.charAt(k-1));
			k--;
		}
		
	}

}
