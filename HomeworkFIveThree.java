/**************************************** *
* Student Name: Chaa Loftin
* Date Due: 03/29/19
* Date Submitted: 03/29/19
* Program Name: HomeworkFiveThree
* Program Description: Program that displays an upside down pyramid of Stars
*
* ****************************************/
package firsthomework;
public class HomeworkFIveThree {
	public static void main(String[]args) {
		
		for (int i = 8; i >0; i--) {
			for (int j = 0; j < 8-i;j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i -1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
