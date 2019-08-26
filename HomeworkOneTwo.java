/*
 * Student Name: Chaa Loftin
 * Date Due: 01/22/2019
 * Date Submitted: 01/23/2019
 * Program Name: FirstHomework
 * Program Description: Displays a conversion from miles to hour to kilometers per hour
 * 
 */

package firsthomework;


public class HomeworkOneTwo {
	public static void main(String[]args) {
		
		//declare variables
		double mile = 24;
		double hour = 1;
		double totalhours = 0;
		double minute = 40;
		double second = 35;
		double kilometersperhour = 0;
		double totalmilesperhour = 0;
				
						
		//convert hours to total hours
		totalhours = (hour + (minute/60) + (second/3600));
		totalmilesperhour = mile/ totalhours;
		
		
		//converts miles to kilometers
		kilometersperhour = (1.6*mile) / (hour + (minute/60) + (second/3600));
		System.out.println(totalmilesperhour + " miles per hour is equivalent to " + kilometersperhour + " Kilometers per hour ");
		
		
		
	}

}
