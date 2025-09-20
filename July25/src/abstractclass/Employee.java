package abstractclass;

public abstract class Employee {
	
	public Employee()
	{
		System.out.println("in employee class");
	}
	
	public abstract String getPersonalDetails();
	protected int getAccount()
	{
		System.out.println("Inside get Account");
		return 0;	
	}
}
