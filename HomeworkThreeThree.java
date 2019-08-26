/**************************************** *
* Student Name: Chaa Loftin
* Date Due: 02 /19 / 19
* Date Submitted: 02 /19 / 19
* Program Name: HomeworkThreeTwo
* Program Description: This program prompts the user to enter three points
* and then decides if a point (p2) is on the same line, left, or right of the points.
*
* ****************************************/
package firsthomework;
import java.util.Scanner;
public class HomeworkThreeThree {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter x and y values of the three points
		
		System.out.println("Enter the value for x1");
		double x1 = input.nextDouble();
		
		System.out.println("Enter the value for y1");
		double y1 = input.nextDouble();
		
		System.out.println("Enter the value for x2");
		double x2 = input.nextDouble();
		
		System.out.println("Enter the value for y2");
		double y2 = input.nextDouble();
		
		System.out.println("Enter the value for x3");
		double x3 = input.nextDouble();
		
		System.out.println("Enter the value for y3");
		double y3 = input.nextDouble();
		
		
		
	//use if-else statements to determine where point is)	
		
		if ((((x2-x1)*(y3-y1)) - ((x3 - x1)*(y2 - y1))) > 0) {
			System.out.println("P2  is on the left side of the line");
		}
		 if  ((((x2-x1)*(y3-y1)) - ((x3 - x1)*(y2 - y1))) == 0) {
			System.out.println("P2 is on the same line");
		}
		if ((((x2-x1)*(y3-y1)) - ((x3 - x1)*(y2 - y1))) < 0) {
			System.out.println("P2 is on the right side of the line");
		
		
		}
	}

}
