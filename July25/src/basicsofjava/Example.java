package basicsofjava;

public class Example {
	
	//non static method
	public void add(int x, int y)
	{
		System.out.println("Addition is : "+(x+y));
	}
	
	public void sub(int x, int y)
	{
		System.out.println("Substraction is : "+(x-y));
	}
	
	public void mul(int x, int y, int z, int m)
	{
		System.out.println("Multiplication is : "+(x*y*z*m));
	}
	
	public void div(int m, int n)
	{
		double result=(double)m/n; 			//explicitly converting the result
		System.out.println("Division : "+result);
	}
	
	public void mod(int m, int n)
	{
		System.out.println("Modulus : "+(m%n));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		Example e=new Example(); //e is an object of class Example
		e.add(15, 5);
		e.sub(25, 50);
		e.mul(5, 10, 15, 20);
		e.div(15, 6);
		e.mod(15, 6);
	}
}