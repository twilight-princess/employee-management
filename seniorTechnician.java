// Honor Pledge: I pledge that I have neither 
// // given nor receieved any help on this assignment.
// // 
// //
// // daelevan

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
