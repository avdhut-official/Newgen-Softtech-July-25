package thisex;

public class Demo1 {
	
	int x;
	
	public Demo1()
	{
		this(37);	//call to parameterised
		x=56;		// d1 object
	}
	
	public Demo1(int x)
	{
		this.x=x;
	}
	
	public void add()
	{
		System.out.println("Value of x :"+x);
		sub();
	}
	
	public void sub()
	{
		System.out.println("Inside Sub");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d1=new Demo1(); //call to default
		d1.add();			//call add method
		
	}
}









