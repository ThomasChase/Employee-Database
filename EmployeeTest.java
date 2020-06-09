/*
 * Created by Thomas Chase
 * Created on June 4, 2020
 * This test application will use the employee class to create employee objects and 
 * display their associated information as well as giving them a raise of 10%
 */
public class EmployeeTest {

	public static void main(String[] args) {
		//Variables
		String fName1 = "Thomas";
		String lName1 = "Chase";
		String fName2 = "Sheldon";
		String lName2 = "Cooper";
		double mSalary1 = 2492.35;
		double mSalary2 = 3568.87;
		
		//Create employee objectsme2, lName2, mSalary2);
		
		Employee employee1 = new Employee(fName1, lName1, mSalary1);
		Employee employee2 = new Employee(fName2, lName2, mSalary2);
		//Display object to user
		System.out.println("Hello we will display our employees below!\n");
		System.out.printf("%10s%10s%10.2f\n",employee1.getFName(),employee1.getLName(),employee1.getYearlySalary());
		System.out.printf("%10s%10s%10.2f\n",employee2.getFName(),employee2.getLName(),employee2.getYearlySalary());
		System.out.println("\nBoth of these employees have been doing outstanding work, lets give them a 10% raise.\n");
		
		//Giving the employees raises
		employee1.giveRaise();
		employee2.giveRaise();
		
		//Display the updated info
		System.out.printf("%10s%10s%10.2f\n",employee1.getFName(),employee1.getLName(),employee1.getYearlySalary());
		System.out.printf("%10s%10s%10.2f\n",employee2.getFName(),employee2.getLName(),employee2.getYearlySalary());

	}

}
