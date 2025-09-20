package thisex;

public class Demo {
	
	int x;
	
	public Demo()
	{
		x=56;		// d1 object
	}
	
	public Demo(int x)
	{
		this.x=x;
	}
	
	public void add()
	{
		System.out.println("Value of x :"+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d1=new Demo(); //call to default
		d1.add();			//call add method
		
		Demo d2=new Demo(15); //call to parameterised
		d2.add();			//call add method
		
		d1.x=39;
		d2.x=25;
		
		d1.add();
		d2.add();
	}
}









