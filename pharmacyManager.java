public class pharmacyManager extends staffPharmacist 
{
	public boolean leadership = true;
	
	public pharmacyManager(int employeeId, String firstName, String lastName, double hourlyRate)
	{
		super(employeeId, firstName, lastName, hourlyRate);
	}
	
	public String getInfo()
  {
		return ("ID: " + employeeId + "Name: " + firstName + " " + lastName + "Rate: " + hourlyRate + " Licensed: " + licensed + " Leadership: " + leadership);
  }
}

