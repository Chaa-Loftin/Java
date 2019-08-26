/**************************************** *
* Student Name: Chaa Loftin
* Date Due: April 23, 2019
* Date Submitted: April 23, 2019
* Program Name: HomeworkSevenTHree
* Program Description: Program that shows that two arrays are the same
*
* ****************************************/

package firsthomework;
import java.util.Scanner;
public class HomeworkSevenThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] list1 = new int[5];
		int [] list2 = new int[5];
		
		
		System.out.println("Enter list 1: ");
		for(int i = 0; i < list1.length; i++) 
			list1[i]=input.nextInt();
		
		System.out.println("Enter list 2: ");
		for(int i = 0; i < list2.length; i ++)
			list2[i] = input.nextInt();
		
		if(equals(list1,list2))
			System.out.println("The two lists are identical");
		else
			System.out.println("THe two lists are not identical");
		
	}
	
	public static boolean equals(int[] list1, int[]list2) {
	boolean b = false;
	for (int i = 0; i < list1.length;i++) {
			if (list1[i]!=list2[i]) {
				b = false;
				
				
			}
			else
				b= true;
		}
		
	
return b;
}
}
