public class seniorTechnician extends staffTechnician 
{
	public boolean serviceAward = true;

	public seniorTechnician()
	{
		super();
	}

	public seniorTechnician(int employeeId, String firstName, String lastName, double hourlyRate)
  {
    super(employeeId, firstName, lastName, hourlyRate);
  }
  
  public String getInfo()
  { 
    return ("ID: " + employeeId + "Name: " + firstName + " " + lastName + "Rate: " + hourlyRate + " Degree: " + degree + " Service Award: " + serviceAward);
  }
}
