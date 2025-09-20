package hierarchicalinheritance;

public class Z extends Y{
	
	int c=25;
	public void min()
	{
		System.out.println("Inside Class Z - min Method");
	}
	public static void main(String[] args) {
		Z z1=new Z();
		z1.square();
		z1.sum();
		z1.min();
	}
	
}
