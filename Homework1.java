package objectOrientedProgramming;

/*
 * Student Name: Chaa Loftin
 * Date Due: 09/06/2019
 * Date Submitted: 
 * Program Name: Homework1
 * Program Description: 
 */

import java.util.*;
public class Homework1 {
	public static void main(String[] args) {
		
						//Create a date object for question 2
		
		java.util.Date date = new java.util.Date();
		
		//Display the date for elapsed time 10000
		date.setTime(10000);
		
		
		
		System.out.println("the date and time for elapsed time of 10000 is " + 
		date.toString());
		
		//display the elapsedTime of 100000
		
		date.setTime(100000);

		System.out.println("the date and time for the elapsed time of 10000 is " +
		date.toString());
		
		//display the elapsedTime of 10000000
		
		date.setTime(10000000);
		
		System.out.println("The date and time for the elapsed time of 10000000 is " +
		date.toString());
		
		//display the elapsedTime of 1000000000
		
		date.setTime(1000000000);
		
		System.out.println("The date and time of elapsed time of 1000000000 is " +
		 date.toString());
		
						
		
								//Question 3
		
		//create random object
		
		Random r1 = new Random(1000);
		
		//run 50 iterations 
		for (int i = 0; i < 50;i++) {
			
			System.out.print(r1.nextInt(100) + " ");
			
			//run separate iterations in 5 rows of 10
			if (i == 9 || i == 19 || i == 29 || i == 39) {
				
				System.out.println("\n");
			}
		
		}
		
	}
}





//Question One
class Rectangle {

	double width = 1;
	double height = 1;
	
	
	//no-arg constructor
	Rectangle() {
		
	}
	//arg constructor with specific height and width
	Rectangle(double newWidth, double newHeight) {
		
		width = newWidth;
		height = newHeight;
		
	}
	//getArea Method
	public double getArea() {
		
		return width*height;
	}
	//GetPerimteter method
	public double getPerimeter() {
		
		return (2 * width) + (2 * height);
	}
	
}

class Stopwatch {
	//set basic properties
	private long startTime = 0;
	private long endTime = 0;
	
	//no arg constructor
	Stopwatch() {
		this.startTime = System.currentTimeMillis();
	}
	//getStartTime method
	public long getStartTime() {
		
		return startTime;
	}
	//getEndTime method
	public long getEndTime() {
		
		return endTime;
	}
	//set startTime to the current time
	public void start() {
		
		startTime = System.currentTimeMillis();
	}
	//set endTime to now
	public void stop() {
		
		endTime = System.currentTimeMillis();
	}
	//return the difference between startTime and endTime
	public long getElapsedTime() {
		
		return endTime - startTime;
	}
}




