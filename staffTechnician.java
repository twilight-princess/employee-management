public class staffTechnician extends Employee
{
	public boolean degree = true;

	public staffTechnician()
	{
		super();
	}

  public staffTechnician(int employeeId, String firstName, String lastName, double hourlyRate)
  {
    super(employeeId, firstName, lastName, hourlyRate);
  }
  
  public String getInfo()
  { 
    return ("ID: " + employeeId + "Name: " + firstName + " " + lastName + "Rate: " + hourlyRate + " Degree: " + degree);
  }

}
