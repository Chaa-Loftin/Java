/*****************************************
* Student Name: Chaa Loftin
* Date Due: Feb 12, 2019
* Date Submitted: Feb 12, 2019
* Program Name: HomeworkTwoTwo
* Program Description: This program prompts the user to enter the distance of a drive
* , the fuel efficiency of a car in mpg, and the price per gallon of fuel.
* The program then displays the total cost of the trip
* ****************************************/
package firsthomework;

import java.util.Scanner;
public class HomeworkTwoTwo {
	public static void main(String[]args) {
		
		//prompt user to enter the distance
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		//prompt the user to input the fuel efficiency of the vehicle in mpg
		
		System.out.println("Enter the fuel efficiency of the vehicle in mpg: ");
		double efficiency = input.nextDouble();
		
		//prompt user to enter value for price of fuel
		
		System.out.println("Enter the price per gallon of fuel: ");
		double fuel = input.nextDouble();
		
		//Equate and display results
		
		double cost = (distance / efficiency) * (fuel);
		cost = (int)(cost * 100)/(100.0);
		System.out.println("The total cost of driving will be $" + cost);
		
	}

}
