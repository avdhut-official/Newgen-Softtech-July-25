package superkeyword;

public class Xyz extends Abc{

	//parameterised constructor
	int m;
	public Xyz()
	{
		m=36;
	}
	
	public Xyz(int m, int n)
	{
		super(n);
		this.m=m;
	}
	
	public void display()
	{
		System.out.println(m+" "+n);
		super.add();//call to super class method
	}

	public static void main(String[] args) {
		
		Xyz x1=new Xyz(25,35);
		x1.display();

		Xyz x2=new Xyz();
		x2.display();
	}
}




