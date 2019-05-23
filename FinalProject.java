package firsthomework;


/***  Project Name: DVD Rental System*  
 * Student Name: Chaa Loftin
 * Date Submitted: 04/25/19
 * Project description: A DVD/CD System that contains 9 methods needed to run a DVD/CD store.
 **/
import java.util.Scanner;
public class FinalProject {
	
	//declare static variables
	static int maxCustomer = 100, maxItem = 5;
	static String[][] customer_record = new String[maxCustomer][5];
	static String[][][] dvd_Cd_List = new String[2][500][4];
	static String [][] rental_record = new String [maxCustomer][maxItem];
	//cd and DVD code can be [code][0 for not rented, 1 for rented]
	static String []dvdCode = new String[maxCustomer];
	static String [] cdCode = new String[maxCustomer];
	
	
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int option = 0;
		
		
		//begin program
		
		while(true) {
			
		
		System.out.println("_____________________________________"
				+ "DVD/CD RENTAL SYSTEM_____________________________________");
		
		System.out.println("(1) ADD CUSTOMER ");
		System.out.println("(2) DELETE CUSTOMER ");
		System.out.println("(3) MODIFY CUSTOMER ");
		System.out.println("(4) ADD DVD/CD ");
		System.out.println("(5) RENTAL DVD/CD ");//finish	
		System.out.println("(6) RETURN DVD/CD ");//finish
		System.out.println("(7) REPORT DVD/CD STORE INFORMATION ");//finish
		System.out.println("(8) EXIT PROGRAM ");
		
		//prompt user for input
		
		System.out.println("WHICH WOULD YOU LIKE TO DO? (ENTER A NUMBER) : ");
		option = input.nextInt();
		
		if (option == 1)
			addCustomer();
		else if (option == 2)
			deleteCustomer();
		else if (option == 3)
			modCustomer();
		else if (option == 4)
			addDvdCd();
		else if (option == 5)
			rental();
		else if (option == 6)
			returnDvdCd();
		else if (option == 7)
			report();
		else if (option == 8)
			exit();
		else 
			invalidInput();
		
		
			
		}	
		
	}
	//method for adding customer
	
	public static void addCustomer() {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("ENTER THE CUSTOMERS NAME: ");
			String name = input.nextLine();
		System.out.println("ENTER THE CUSTOMERS ADDRESS: ");
			String address = input.nextLine();
		System.out.println("Enter the customers phone number: ");
			String number = input.nextLine();
		System.out.println("Enter the customer's enrolling date: ");
			String date = input.nextLine();
			
		for (int i = 0; i < maxCustomer;i++) {
			if (customer_record[i][0] == null) {
				customer_record [i][0] = name;
				customer_record [i][1] = address;
				customer_record[i][2] = number;
				customer_record[i][3] = date;
				customer_record[i][4] = null;
			}
		}
		
	}
	
	public static void deleteCustomer() {
		Scanner input = new Scanner(System.in);		
		String name, indexItem;
		int index=0;
		boolean tag=false;
		
		System.out.println("Name: ");
		name = input.nextLine();
		
		for (int i=0; i<maxCustomer; i++){
			if (customer_record[i][0] != null){
				if (customer_record[i][0].equals(name) && customer_record[i][4] ==null) {					
					customer_record[i][0] = null;
					customer_record[i][1] = null;
					customer_record[i][2] = null;
					customer_record[i][3] = null;
					customer_record[i][4] = null;
					System.out.println(name+" information deleted successfully !");
					tag=true;
					break;
				}else if (customer_record[i][0].equals(name) && customer_record[i][4] !=null){					
					System.out.println(name + " has rented item");
					tag=true;
					break;
				}				
			}
		}
		
		if(!tag)			
			System.out.println(name + " has no record. ");
	}
			public static void modCustomer() {
				Scanner input = new Scanner(System.in);
				
				System.out.println("Modify the existing information for your customer");
				System.out.println("Customer name is? ");
				String name = input.nextLine();
				
				
				//for loop will add new information at certain index
				for (int i = 0;i < maxCustomer;i++) {
					
					if (customer_record[i][0].equals(name)) {
				
					
					
					
				System.out.println("New name is? : ");
				String newName = input.nextLine();
				customer_record[i][0] = newName;
				System.out.println("New address is? : ");
				String newAddress= input.nextLine();
				customer_record[i][1] = newAddress;
				System.out.println("New number is?: ");
				String newNumber = input.nextLine();
				customer_record[i][2] = newNumber;
				System.out.println("What is the new date?: ");
				String newDate = input.nextLine();
				customer_record[i][3] = newDate;
				break;
	
					}
				
				}
				
				
			}
			
			public static void addDvdCd() {
				Scanner input = new Scanner(System.in);
				
		System.out.println("Enter CD/DVD information: ");
				
				System.out.println("Title: ");
				String title = input.nextLine();
				
				System.out.println("Company: ");
				String company = input.nextLine();
				
				System.out.println("Release Date: ");
				String releaseDate = input.nextLine();
				
				System.out.println("Enter 0 if CD. Enter 1 if DVD: ");
				int choice = input.nextInt();
				
				if (choice == 0) {
				
				for (int i = 0; i < 500;i++) {
					if (dvd_Cd_List [0][i][0] == null) {
						dvd_Cd_List [0][i][0] = title;
						dvd_Cd_List [0][i][1] = company;
						dvd_Cd_List [0][i][2] = releaseDate;
						dvd_Cd_List [0][i][3] = null; //borrowed date
						System.out.println("Successfully stored CD");
						break;
					}
				}
			} else if (choice == 1) {
			
				for (int i = 0; i < 500;i++)
					if (dvd_Cd_List [1][i][0] == null) {
						dvd_Cd_List [1][i][0] = title;
						dvd_Cd_List [1][i][1] = company;
						dvd_Cd_List [1][i][2] = releaseDate;
						dvd_Cd_List [1][i][3] = null;
						System.out.println("Successfully Stored DVD");
						break;
			}
				
	} else 
		System.out.println("You have not entered a valid input. Input must be 0 or 1");
	
}
	public static void rental() {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("CD title: ");
		String cdTitle = input.nextLine();
		
		System.out.println("DVD title: ");
		String dvdTitle = input.nextLine();
		
		System.out.println("Rental date: (day only)");
		String rentalDate = input.nextLine();
		
		
		
		System.out.println("What is the customers name?");
		 String name = input.nextLine();
		
		System.out.println("Is this for an existing customer ? (0 for yes, 1 for no)");
		int answer = input.nextInt();
		
		if (answer == 0) {
			System.out.println("is this DVD or CD? Enter 0 for CD, 1 for DVD. ");
			
			int response = input.nextInt();
			
			if (response == 0) {
			
				
		for (int i = 0; i < 5; i++) {
			 
			
			if (rental_record [i][0] == null) {
				rental_record[i][0] = cdTitle;
				rental_record[i][1] = null;
				rental_record[i][2] = rentalDate;
				rental_record[i][3] = null;
				rental_record[i][4] = name;
				cdCode [i] = "CD00000" + i;
				
				//try to assign rental record to customer
				for ( int j = 0; j < maxCustomer; j++) {
					if (customer_record[j][0].equals(name))
						customer_record [j][4] = "renting";
					System.out.println("Successfully saved");
					break;
				
				}
			break;	
			}
		}
		} else if (response == 1) {
			for (int i = 0; i < 5;i++) {
				
				if (rental_record [i][1] == null) {
					rental_record[i][0] = null;
					rental_record[i][1] = dvdTitle;
					rental_record[i][2] = rentalDate;
					rental_record[i][3] = null;
					rental_record[i][4] = name;
					dvdCode [i] = "DVD00000" + i;
					
					for ( int j = 0; j < 100; j++) {
						if (customer_record[j][0].equals(name))
							customer_record [j][4] = "renting";
						System.out.println("Successfully saved DVD");
					
					}
					break;
				 
		 }
			
		}
		
		}else {
			System.out.println("invalid input, enter one or zero");
		
			}
			
		
	} else if ( answer ==1) {
		System.out.println("You need to add customer before adding a rental record");
		addCustomer();
	} else
		System.out.println("Invalid input, enter 0 or 1");
	}
	
	public static void returnDvdCd() {
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Return DVD/CD");
		System.out.println("Who is returning this CD/DVD?");
		String name = input.nextLine();
		System.out.println("Title: ");
		String title = input.nextLine();
		System.out.println("Return date : (day only) ");
		String returnDate = input.nextLine();
		
		
		
		for (int i = 0; i < maxCustomer; i++) {
			//if it is a DVD calculate cost
			
			int daysOverdue;
			

			
			if (rental_record[i][1] != null && rental_record[i][1].equals(title)) {
				
				rental_record[i][3] = returnDate;
				String y = rental_record[i][3];
				String x= rental_record[i][2];
				System.out.println("Customer Name: "  + (rental_record[i][4]));
				System.out.println("DVD Title:  No of Days Borrowed  No of Days Overdue "
							+ "Total Owed");
				int dvdCost = 5;
				
				int daysBorrowed = (Integer.parseInt(y) - Integer.parseInt(x));
				
				if(daysBorrowed > 7) {
					int totalCost = (((daysBorrowed - 7) * (dvdCost+1)) + 35);
					daysOverdue = daysBorrowed - 7;
					
					System.out.println("\n" + title + "\t \t" + daysBorrowed + "\t \t \t" + 
					daysOverdue + "\t \t " + totalCost);
					dvdCode[i] = null;
					rental_record[i][1]= null; 
					rental_record[i][2] = null;
					rental_record[i][3] = null;
					rental_record[i][4] = null;
					
					
				}
			
				else {
					int totalCost = (daysBorrowed * dvdCost);
					daysOverdue = 0;
					
					System.out.println("\n" + title + "\t \t" + daysBorrowed + "\t \t \t" + 
							daysOverdue + "\t \t " + totalCost);
					dvdCode[i]= null;
					rental_record[i][1] = null;
					rental_record[i][2] = null;
					rental_record[i][3] = null;
					rental_record[i][4] = null;
				
				}
			
				
				
			} else if (rental_record[i][0] != null && rental_record[i][0].equals(title)) {
				rental_record[i][3] = returnDate;
				String y = rental_record[i][3];
				String x= rental_record[i][2];
				//calculate cost if it is a CD
				System.out.println("Customer Name: "  + name);
				System.out.print("CD Title:  No of Days Borrowed  No of Days Overdue  Total Owed");
				
				int cdCost = 3;
				
				int daysBorrowed = (Integer.parseInt(y) - Integer.parseInt(x));
				
				if(daysBorrowed > 7) {
					int totalCdCost = (((daysBorrowed - 7) * (cdCost+1)) + 21);
					daysOverdue = daysBorrowed -7;
					
					System.out.println("\n" + title + "\t \t" + daysBorrowed + "\t \t \t " + 
							daysOverdue + "\t \t " + totalCdCost);
					cdCode[i] = null;
					rental_record[i][0]= null; 
					rental_record[i][2] = null;
					rental_record[i][3] = null;
					rental_record[i][4] = null;
					
				}
				else {
					int totalCdCost = (daysBorrowed * cdCost);
					daysOverdue = 0;
					
					System.out.println("\n" + title + "\t \t" + daysBorrowed + "\t \t \t" + 
							daysOverdue + "\t \t " + totalCdCost);
					cdCode[i] = null;
					rental_record[i][0] = null; 
					rental_record[i][2] = null;
					rental_record[i][3] = null;
					rental_record[i][4] = null;
					
			}	
				
		
			} else  {
			break;
			
		}
		}
		}
		
	
	public static void report() {
		System.out.println("Report DVD/CD rental store information ");
		System.out.println("Video Code " + "\t" + " Title " + "\t" + " Borrowed by ");
		
		for (int i = 0; i < maxCustomer;i++) {
			if (dvdCode[i] != null) {
		
				for ( int j = 0; i < 5;j++) {
			
					if (rental_record[j][1] != null && rental_record[j][4] != null) {
						
						System.out.println(dvdCode[j] + "\t" + rental_record[j][1] +
				 
						"\t" + rental_record[i][4]);
						
						break;
			}
					else {
						break;
					}
				}
			}
			else if (cdCode[i] != null) {
		
		for(int j = 0; i < 5; j++) {
			if (rental_record[i][0] != null && rental_record[i][4] != null) {
				
			
			System.out.println(cdCode[i] + "\t" + rental_record[i][0]
					+ "\t" + rental_record[i][4]);
			break;
			}
			else
				break;
		}
		} else {
			System.out.println("There are no other DVD's or CD's being rented");
			break;
			
		}
		}
	}
	public static void exit() {
		System.exit(1);
		
	}
	public static void invalidInput() {
		
		System.out.println("Invalid input, please enter a valid number.");
		
	}

}


	


