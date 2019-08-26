/**************************************** *
* Student Name: Chaa Loftin
* Date Due: 02 /19 / 19
* Date Submitted: 02 /19 / 19
* Program Name: HomeworkThreeTwo
* Program Description: This program prompts the user to enter three integers
* and then ranks them in ascending order
*
* ****************************************/
package firsthomework;
import java.util.Scanner;
public class HomeworkThreeTwo {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		//ask user to enter the three integers
		
		System.out.println("Enter value for integer one");
		int one = input.nextInt();
		
		System.out.println("Enter value for integer two");
		int two = input.nextInt();
		
		System.out.println("Enter value for integer three");
		int three = input.nextInt();
		
		//sort numbers with if-else statements
		int temp;
		if (two < one || three < one)
		{
			if (two < one)
			{
				temp = one;
				one = two;
				two = temp; 
			}
			if (three < one)
			{
				temp = one;
				one = three;
				three = temp;
			}
		}
		if (three < two)
		{
			temp = two;
			two = three;
			three = temp;
		}
		
		//Display numbers in ascending order
		
		System.out.println("The values ranked in ascending order are:" + one + " " + two + " " + three);
	}
//Display numbers in ascending order
	
	
}
