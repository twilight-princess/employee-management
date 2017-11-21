public class Employee
{
	public int employeeId;
	public String firstName;
	public String lastName;
	public double hourlyRate;

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
}



