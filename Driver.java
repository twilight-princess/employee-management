import java.io.*;
import java.util.*;

public class Driver
{


	public static void main(String [] args)
	{
		List<pharmacyManager> pharmacyManagers = new ArrayList<pharmacyManager>();
		List<staffPharmacist> staffPharmacists = new ArrayList<staffPharmacist>();
		List<staffTechnician> staffTechnicians = new ArrayList<staffTechnician>();
		List<seniorTechnician> seniorTechnicians = new ArrayList<seniorTechnician>();
		boolean keepGoing = true;
		while(keepGoing == true)
		{
			System.out.println("1. Load Employees (From File)");
			System.out.println("2. Exit Program");	
			Scanner userChoice = new Scanner(System.in);
			System.out.println("Enter your selection: ");
			int choice = userChoice.nextInt();
			if (choice == 1)
			{
				try
        { 
        	InputStream inputStream = new FileInputStream("employees.txt");
          InputStreamReader reader = new InputStreamReader(inputStream);
          BufferedReader buffer = new BufferedReader(reader);
          // gets the first line in the file
          String line = buffer.readLine();
          line = buffer.readLine();
          while (line != null)
          {
          	String employeeInfo[] = line.split(",");
            String jobId = (employeeInfo[0]);
            int employeeId = Integer.parseInt(employeeInfo[1]);
            String firstName = employeeInfo[2];
            String lastName = employeeInfo[3];
            double hourlyRate = 0.00;
            if (jobId == "1")
            {
            	hourlyRate = 50.00;
							pharmacyManager newPManager = new pharmacyManager(employeeId, firstName, lastName, hourlyRate);
            	pharmacyManagers.add(newPManager);
						}
            else if (jobId == "2")
            {
            	hourlyRate = 40.00;
            	staffPharmacist newSPharmacist = new staffPharmacist(employeeId, firstName, lastName, hourlyRate);
							staffPharmacists.add(newSPharmacist);
						}
            else if (jobId == "3")
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

						//Employee newEmployee = new Employee(employeeId, firstName, lastName, hourlyRate);
            line = buffer.readLine();
            }
            buffer.close();
          }
          catch (IOException ex)
          {
            System.err.println(ex);
          }

			
				System.out.println("1. Print Employee Information");
				System.out.println("2. Enter Hours Worked");
				System.out.println("3. Calculate Paychecks");
				System.out.println("4. Exit Program");
				Scanner userChoice2 = new Scanner(System.in);
				System.out.println("Enter your selection: ");
				int choice2 = userChoice2.nextInt();
				if (choice2 == 1)
				{	
					for(staffTechnician employee : staffTechnicians)
					{
						System.out.println(employee.getInfo());
						System.out.println("staffTechnicians.get(i).getInfo()");
					}
				}
				else if (choice2 == 2)
				{
					Scanner userChoice3 = new Scanner(System.in);
					System.out.println("Please enter hours worked: ");
					int hours = userChoice3.nextInt();	
				}
				else if (choice2 == 3)
				{
					// calculate paycheck
				}
				else if (choice2 == 4)
				{
					keepGoing = false;
					System.out.println("Goodbye!");
				}
				else
				{
					System.out.println("Please choose a valid option.");
					main(args);
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
				main(args);
			}
		}
	}
}

