package basicsofjava;

public class MethodOverloadingEx{

	public void add(int a,  int b)
	{
		System.out.println("Sum of 02 int ="+(a+b));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("Sum of 03 int ="+(a+b+c));
	}

	public void add(double a, double b)
	{
		System.out.println("Sum of 02 double ="+(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingEx m1=new MethodOverloadingEx();
		m1.add(10.15, 15);
		m1.add(15.25, 25.15);
		m1.add(15, 20, 30);
	}

}






