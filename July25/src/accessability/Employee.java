package accessability;

public class Employee extends Account {
	
	final String acc_type="Savings"; 
	
	public int getBalance()
	{
		System.out.println("in employee class - Balance");
		System.out.println("Acc no - "+acc_no);
		return bal;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getSalary();	
		e1.getBalance();
	}
	
	

}
