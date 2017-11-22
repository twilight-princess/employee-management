// Honor Pledge: I pledge that I have neither 
// given nor receieved any help on this assignment.
// 
//
// daelevan

public class Employee
{
	public int employeeId;
	public String firstName;
	public String lastName;
	public double hourlyRate;
	public int hours = 0;

	public Employee()
	{

	}

	public Employee(int employeeId, String firstName, String lastName, double hourlyRate)
	{
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
	}

	public String getInfo()
	{
		return ("ID: " + employeeId + " Name: " + firstName + " " + lastName + " Rate: " + hourlyRate);
	}
	
	public String getPaycheck(int hours)
	{
		return ("ID: " + employeeId + " Check Amount: " + (hourlyRate * hours));
	}
}



