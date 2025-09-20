package accessability;

public class Account {
	
	int sal, bal;
	final int acc_no=111111; 
	public final int getSalary()
	{
		System.out.println("in account class");
		return sal;
	}
	
	public int getBalance()
	{
		System.out.println("in account class - Balance");
		return bal;
	}
}
