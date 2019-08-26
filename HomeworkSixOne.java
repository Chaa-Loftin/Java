package firsthomework;
/**************************************** *
* Student Name: Chaa Loftin		
* Date Due: 04/10/19
* Date Submitted: 04/10/19
* Program Name: HomeworkSixOne
* Program Description: THis program compues a series of numbers and displays them
*
* ****************************************/

public class HomeworkSixOne {
	public static void main(String[]args) {
	
		//D & I variables
		int seriesStart = 1;
		int numberOfRows = 20;
		
		System.out.println("i        m(i)");
		System.out.println("______________________");
		
		//display data with for loop
		for (double i = seriesStart; i <= numberOfRows; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", sumSeries(i));
		}
		
		
		
	}
	//write method to compute sum
	public static double sumSeries(double x) {
		
		double sum = 0;
		for (double i = 1; i <= x; i ++)
			sum += i/ (i+1);
		
		return sum;
	}

}
