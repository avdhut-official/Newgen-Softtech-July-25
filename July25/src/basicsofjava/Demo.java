package basicsofjava;

public class Demo {

	//constructor a special method
	//default constructor
	public Demo()
	{
		System.out.println("Default Constructor");
	}
	
	//parameterised constructor
	public Demo(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		Demo d2=new Demo(10);
	}

}
