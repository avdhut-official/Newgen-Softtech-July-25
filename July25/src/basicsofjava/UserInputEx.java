package basicsofjava;
import java.util.Scanner;

public class UserInputEx {

	public void add(int x, int y)
	{
		System.out.println("Sum ="+(x+y));
	}
	
	public void sub(double a, double b)
	{
		System.out.println("Substraction ="+(a-b));
	}
	
	public void concat(String str, String str1)
	{
		System.out.println(str+str1);
	}
	
	public void square(int z)
	{
		System.out.println("Square : "+(z*z));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInputEx u=new UserInputEx();
		
		//to take input from user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("provide value for x: ");
		int a=sc.nextInt();
		System.out.println("provide value for y: ");
		int b=sc.nextInt();
		u.add(a, b);	//add method which takes 2 int values
		
		System.out.println("provide value for m in fraction: ");
		double m=sc.nextDouble();
		System.out.println("provide value for n in fraction: ");
		double n=sc.nextDouble();
		u.sub(m, n);
		
		System.out.println("provide 1st string :");
		String str=sc.next();
		System.out.println("provide 2nd string :");
		String str1=sc.next();
		
		u.concat(str, str1);
		
		System.out.println("provide a number :");
		int z=sc.nextInt();
		u.square(z);
	}
}






