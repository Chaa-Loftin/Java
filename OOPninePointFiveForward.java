package firsthomework;

import java.util.*;
public class OOPninePointFiveForward {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		/* Random Date stuff
		Date d1 = new Date();
		System.out.println("The elapsed time since Jan 1, 1970 is "
				+ d1.getTime() + " milliseconds");
		
		System.out.println(d1.toString());
		System.out.println(d1);
		*/
		
		/*
		//same seed inside the random argument would
		//essentially create the same results for 
		//random method
		
		Random r1 = new Random();
		System.out.println("From r1: ");
		for ( int i = 0; i < 10; i++) {
			
			System.out.println(r1.nextInt(1000));
		}
		
	
		Random r1 = new Random(2);
		Random r2 = new Random(2);
		Random r3 = new Random(3);
		
		for ( int i = 0; i < 10; i++) {
			
			System.out.print(r1.nextInt(1000) + " ");
		}
		
		
		//Circle With Static Members Main Method
		
		//static methods and variables cam be accessed 
		//without instantiation an objects
		
		System.out.println("Before creating 2 objects");
		System.out.println(Circle.numberOfObjects);
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5);
		
		System.out.println("after creating 2 objects");
		//assigning value to var for the hell of it
		
		int x = Circle.getNumberOfObjects();
		
		System.out.println(x);
		
		*/  
		
		/*			CircleWithPrivateDataFields
		
		//Create Circle with radius of 5.0
		
		Circle c1 = new Circle(5.0);
		System.out.println("The area of the circle of the radius "
				+ c1.getRadius() + " is " + c1.getArea());
		
		//Increase the Circles's radius by 10%
		
		c1.setRadius(c1.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " +
		c1.getRadius() + " is " + c1.getArea());
		
		System.out.println("the number of objects created is " +
		Circle.getNumberOfObjects());
		
		*/
	}
		
	}
		

						//CircleWithStaticMembers//
/*
class Circle{
	//You should always declare constants
	//I should have assigned PI a value and not
	//used Math.PI below in the code
	final static double PI = Math.PI;
	
	double radius = 1;
	static int numberOfObjects = 0;
	
	//constructors
	
	Circle() {
		radius = 1;
		numberOfObjects++;
	}
	
	Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	//Methods
	
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
}
*/


/*				CircleWithPrivateDataFields

class Circle{
	private double radius = 1.0;
	private static int numberOfObjects = 0;
	
	public Circle() {
		numberOfObjects++;
	}
	
	public Circle(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

*/

