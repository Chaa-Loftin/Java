/**************************************** *
* Student Name: Chaa Loftin
* Date Due: 03/29/19
* Date Submitted: 03/29/19
* Program Name: HomeworkFiveTwo
* Program Description: A nested for loop that creates an X out of various numbers
*
* ****************************************/
package firsthomework;
public class HomeworkFiveTwo {
	public static void main(String[]args) {
		
		
		for (int i = 1; i < 8 ;++i ) {
			for (int j = 1; j < 8; ++j ) {
				if (i==j) {
					System.out.print(i);
				}else if (i == 8 - j) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
	}

	}
}
