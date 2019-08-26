/*****************************************
* Student Name: Chaa Loftin
* Date Due: Feb 12, 2019
* Date Submitted: Feb 12, 2019
* Program Name: HomeworkTwoOne
* Program Description: This program prompts the user to enter three 
* points of a triangle and display the area 
* ****************************************/
package firsthomework;

import java.util.Scanner;

public class HwTwoOne {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		//prompt the user enter values for point 1
		
		System.out.println("Enter the x and y values for point one: ");
		double x1 = input.nextDouble();
		double y1 =input.nextDouble();
		
		//prompt the user to enter values for point 2
		System.out.println("Enter the x and y values for point two: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		//prompt the user to enter values for point 3
		System.out.println("Enter the x and y values for point three: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		//Enter equations for side1,side2,side3
		
		double side1 = Math.sqrt((Math.pow(x2-x1, 2.0)) + (Math.pow(y2-y1, 2.0)));  
		
		
		double side2 = Math.sqrt((Math.pow(x3-x2, 2.0)) + (Math.pow(y3-y2, 2.0)));
		
		
		double side3 = Math.sqrt((Math.pow(x3-x1, 2.0)) + (Math.pow(y3-y1, 2.0)));
		
		
		//Enter equation for "S" value
		
		double s1 = (side1 + side2 + side3)/2;
		
		
		//Enter equation for area of a triangle and print value for area
		
		double area = Math.sqrt(s1 * ((s1 - side1) * (s1 - side2) * (s1 - side3)));
		area = (int)(area * 100)/100.0;
		System.out.println("The area of the triangle is " + area);
		
	}

}
