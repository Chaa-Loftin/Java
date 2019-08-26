/**************************************** *
* Student Name: Chaa Loftin
* Date Due: April 24, 2019
* Date Submitted: April 24, 2019
* Program Name: ProgramSevenOne
* Program Description: A selection sort program
*
* ****************************************/
package firsthomework;
import java.util.Scanner;
public class HomeworkSevenOne {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
	int []array = new int[5];
		
		System.out.println("What numbers would you like to sort? ");
		for ( int i = 0; i < array.length; i ++) {
			array[i] = input.nextInt();
		}
		
		selectionSort(array);
		for ( int i = 0; i < array.length; i++)
			System.out.print(array[i]);
	}
public static void selectionSort(int array[]) {
	int temp;
	
	
	for (int i = 0; i < array.length - 1; i ++) {
		int currentMin = array[i];
		int currentMinIndex = i;
		for (int j = i + 1; j < array.length; j++) {
		if (currentMin > array[j]) {
			currentMin = array[j];
			currentMinIndex =j;
		}	
	}
	if (currentMinIndex != i ) {
		array[currentMinIndex]= array[i];
		array[i] = currentMin;
	}
}
}
}
