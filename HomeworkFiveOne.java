/**************************************** *
* Student Name: Chaa Loftin
* Date Due: 03/29/19
* Date Submitted: 03/29/19
* Program Name: HomeworkFiveOne
* Program Description: A game that allows the user to continuously guess
* whether a coin flip results in heads of tails until the user wins
*
* ****************************************/
package firsthomework;
import java.util.Scanner;
public class HomeworkFiveOne {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		//create random number and declare guess
		int number = ((int)(Math.random() *2));
		
		
		System.out.println("Guess heads or tails. 0 for heads and 1 for tails");
		int guess = input.nextInt();
		
		if (guess != number)
			System.out.println("incorrect");
		
		
		while (guess != number) {
			
			System.out.println(" \nGuess head or tails. 0 for head and 1 for tails: ");
			number = ((int)(Math.random() * 2));
			guess = input.nextInt();
			
			if (guess == 0 && guess != number) {
				System.out.print("Sorry, it is tails.");
				continue;
			}
				else if ( guess == 1 && guess != number) {
					System.out.print("Sorry, it is heads.");
					continue;
				}
				else  {
					System.out.println("You can only use 0 or 1");
					continue;
				}
			
		}
		System.out.println("You are correct");
		
	}
}
		
		
		
	

