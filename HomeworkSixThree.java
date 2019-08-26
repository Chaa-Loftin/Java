/**************************************** *
* Student Name: Chaa Loftin
* Date Due: 04/10/19
* Date Submitted: 04/10/19
* Program Name: HomeworkSixThree
* Program Description: This program displays twin prime numbers between 0 and 1000
*
* ****************************************/
package firsthomework;

public class HomeworkSixThree {
	public static void main(String[]args) {
		
		//declare variables
		
		
		//set parameters
		for (int i = 2,  j = i + 2; i < 1000; i++, j++) {
		if (isPrime(i) && isPrime(j))
				System.out.println("(" + i + "," + j + ")");
		}
		}
		//create method to determine if numbers are prime
public static boolean isPrime(int num) {
	for (int i =2; i <= num/2; i++) {
		if (num % i == 0)
			return false;
	}
	return true;
	}
}



