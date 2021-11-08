// Unit 2 Assignment: Managing employee data - Jade Park (8-28-2021)

import java.util.Scanner;

public class Assignment2 { // Driver class

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to Starr! How many employees would you like to enter? ");
		int selection = input.nextInt();
		
		// creating an array holding the employees the user inputs
		Employee[] myEmployees = new Employee[selection];
		
		for (int i = 0; i < selection; i++) {
			
			System.out.print("\nWhich type of employee are you entering?  1 - Hourly, 2 - Salaried, 3 - Contractor: ");
			int choice = input.nextInt();
			
			if (choice == 1) { // hourly employee
				System.out.println("Enter the following information for this Hourly employee: ");
				
				System.out.print("Employee's Name: ");
				input.nextLine();
				String name = input.nextLine();
				
				System.out.print("Job Title: ");
				String title = input.nextLine();
				
				System.out.print("Hire Date: ");
				String hireDate = input.next();
				
				System.out.print("Hourly Rate: ");
				int rate = input.nextInt();
				
				System.out.print("Hours Worked: ");
				int hours = input.nextInt();
				
				// adding the hourly employee object to the array
				myEmployees[i] = new HourlyEmployee(title, name, hireDate, rate, hours);
				
			} else if (choice == 2) { // salaried employee
				System.out.println("Enter the following information for this Salaried employee: ");
				
				System.out.print("Employee's Name: ");
				input.nextLine();
				String name = input.nextLine();
				
				System.out.print("Job Title: ");
				String title = input.nextLine();
				
				System.out.print("Hire Date: ");
				String hireDate = input.next();
				
				System.out.print("Salary: ");
				int salary = input.nextInt();
				
				System.out.print("Bonus: ");
				int bonus = input.nextInt();
				
				// adding the salaried employee object to the array
				myEmployees[i] = new SalariedEmployee(title, name, hireDate, salary, bonus);
				
			} else if (choice == 3) { // contractor
				System.out.println("Enter the following information for this Contractor: ");
				
				System.out.print("Employee's Name: ");
				input.nextLine();
				String name = input.nextLine();
				
				System.out.print("Job Title: ");
				String title = input.nextLine();
				
				System.out.print("Hire Date: ");
				String hireDate = input.next();
				
				System.out.print("Contract Start: ");
				String start = input.next();
				
				System.out.print("Contract End: ");
				String end = input.next();
				
				System.out.print("Hourly Rate: ");
				int rate = input.nextInt();
				
				System.out.print("Company: ");
				input.nextLine();
				String company = input.nextLine();
				
				// adding the contractor object to the array
				myEmployees[i] = new Contractor(title, name, hireDate, rate, start, end, company);
				
			}
			
		}
		
		System.out.println("\nReport: ");
		
		for (int i = 0; i < selection; i++) { 
			// invokes the toString method
			System.out.println(myEmployees[i]);
		}
		
	}

}
