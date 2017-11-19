import java.io.*;
import java.util.Scanner;

public class Driver
{
	public static void main(String [] args)
	{
		boolean keepGoing = true;
		while(keepGoing == true)
		{
			System.out.println("1. Load Employees (From File)");
			Sysytem.out.println("2. Exit Program");	
			Scanner userChoice = new Scanner(System.in);
			System.out.println("Enter your selection: ");
			int choice = userChoice.nextInt();
			if (choice == 1)
			{
				System.out.println("1. Print Employee Information");
				System.out.println("2. Enter Hours Worked");
				System.out.println("3. Calculate Paychecks");
				System.out.println("4. Exit Program");
				Scanner userChoice2 = new Scanner(System.in);
				System.out.println("Enter your selesction; ");
				int choice2 = userChoice2.nextInt();
				if (choice2 == 1)
				{
					try
					{	
						InputStream inputStream = new FileInputStream("employees.txt");
						InputStreamReader reader = InputStreamReader(inputStream);
						BufferedReader buffer = new BufferedReader(reader);
						// gets the first line in the file
						String line = buffer.readLine();
						while (line != null)
						{
							// Print employee info
							// line = buffer.readLine();
						}
						// buffer.close();
					}
					catch (IOException ex)
					{
						System.err.println(ex);
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
