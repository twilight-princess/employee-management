// Honor Pledge: I pledge that I have neither 
// // given nor receieved any help on this assignment.
// // 
// //
// // daelevan

public class staffPharmacist extends Employee
{
	public boolean licensed = true;

	public staffPharmacist()
	{
		super();
	}

	public staffPharmacist(int employeeId, String firstName, String lastName, double hourlyRate)
	{
		super(employeeId, firstName, lastName, hourlyRate);
	}
 
	public String getInfo()
  {
    return ("ID: " + employeeId + "Name: " + firstName + " " + lastName + "Rate: " + hourlyRate + " Licensed: " + licensed);
  }
}
