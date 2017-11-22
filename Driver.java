// Honor Pledge: I pledge that I have neither 
// given nor receieved any help on this assignment.
//  
// 
// daelevan

import java.io.*;
import java.util.*;

public class Driver
{
	public static void main(String [] args)
	{
		// creating array lists for types of employees
		List<pharmacyManager> pharmacyManagers = new ArrayList<pharmacyManager>();
		List<staffPharmacist> staffPharmacists = new ArrayList<staffPharmacist>();
		List<staffTechnician> staffTechnicians = new ArrayList<staffTechnician>();
		List<seniorTechnician> seniorTechnicians = new ArrayList<seniorTechnician>();
		int hours = 0;
		boolean keepGoing = true;
		while(keepGoing == true)
		{
			// presents the first menu to the user
			System.out.println("1. Load Employees (From File)");
			System.out.println("2. Exit Program");	
			Scanner userChoice = new Scanner(System.in);
			System.out.println("Enter your selection: ");
			// sets the choice to go through the menu
			int choice = userChoice.nextInt();
			if (choice == 1)
			{
				try
        { 
					// loads the txt file
        	InputStream inputStream = new FileInputStream("employees.txt");
          InputStreamReader reader = new InputStreamReader(inputStream);
          BufferedReader buffer = new BufferedReader(reader);
          // gets the first line in the file
          String line = buffer.readLine();
          // skips the first line in the text file
					line = buffer.readLine();
					// while the line isn't empty it sets the employees to their array lists
          while (line != null)
          {
          	String employeeInfo[] = line.split(",");
            int jobId = Integer.parseInt(employeeInfo[0]);
            int employeeId = Integer.parseInt(employeeInfo[1]);
            String firstName = employeeInfo[2];
            String lastName = employeeInfo[3];
            double hourlyRate = 0.00;
						// sets them to their array list and sets their hourly rate
            if (jobId == 1)
            {
            	hourlyRate = 50.00;
							pharmacyManager newPManager = new pharmacyManager(employeeId, firstName, lastName, hourlyRate);
            	pharmacyManagers.add(newPManager);
						}
            else if (jobId == 2)
            {
            	hourlyRate = 40.00;
            	staffPharmacist newSPharmacist = new staffPharmacist(employeeId, firstName, lastName, hourlyRate);
							staffPharmacists.add(newSPharmacist);
						}
            else if (jobId == 3)
            {
            	hourlyRate = 20.00;
							staffTechnician newSTechnician = new staffTechnician(employeeId, firstName, lastName, hourlyRate);
							staffTechnicians.add(newSTechnician);
            }
            else
            {
            	hourlyRate = 25.00;
							seniorTechnician newSenTechnician = new seniorTechnician(employeeId, firstName, lastName, hourlyRate);
							seniorTechnicians.add(newSenTechnician);
            }

            line = buffer.readLine();
            }
            buffer.close();
          }
          catch (IOException ex)
          {
            System.err.println(ex);
          }
				// starts the second menu
				boolean keepGoing2 = true;
				while(keepGoing2 == true)
				{	
				System.out.println("1. Print Employee Information");
				System.out.println("2. Enter Hours Worked");
				System.out.println("3. Calculate Paychecks");
				System.out.println("4. Exit Program");
				Scanner userChoice2 = new Scanner(System.in);
				System.out.println("Enter your selection: ");
				int choice2 = userChoice2.nextInt();
				if (choice2 == 1)
				{	
					// loops through and prints out each type of employee 
					for(pharmacyManager employee : pharmacyManagers)
					{
						System.out.println(employee.getInfo());
					}
					for(staffPharmacist employee : staffPharmacists)
					{	
						System.out.println(employee.getInfo());
					}
					for(staffTechnician employee : staffTechnicians)
					{
						System.out.println(employee.getInfo());
					}
					for(seniorTechnician employee : seniorTechnicians)
					{
						System.out.println(employee.getInfo());
					}
				}
				//saves the hours worked for all employees
				else if (choice2 == 2)
				{
					Scanner userChoice3 = new Scanner(System.in);
					System.out.println("Please enter hours worked: ");
					hours = userChoice3.nextInt();
					choice = 1;	
				}
				else if (choice2 == 3)
				{
					// calculate paycheck
					if (hours == 0)
					{
						System.out.println("Please enter the hours worked (Option #2) before trying to calculate the paycheck amounts!");
						choice2 = 2;
					}
					// prints our paychecks
					else
					{
						for(pharmacyManager employee : pharmacyManagers)
						{
							System.out.println(employee.getPaycheck(hours));	
						}
						for(staffPharmacist employee : staffPharmacists)
						{
							System.out.println(employee.getPaycheck(hours));	
						}
						for(staffTechnician employee : staffTechnicians)
						{
							System.out.println(employee.getPaycheck(hours));
						}
						for(seniorTechnician employee : seniorTechnicians)
						{
							System.out.println(employee.getPaycheck(hours));	
						}
					}
				}
				//stops both menus
				else if (choice2 == 4)
				{
					keepGoing = false;
					keepGoing2 = false;
					System.out.println("Goodbye!");
				}
				else
				{
					System.out.println("Please choose a valid option.");
					main(args);
				}
				}
			}
			else if (choice == 2)
			{
				keepGoing = false;
				System.out.println("Goodbye!");
			}
			else
			{
				System.out.println("Please choose a valid option.");
				Driver.main(args);
			}
		}
	}
}

