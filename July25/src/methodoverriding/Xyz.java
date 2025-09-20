package methodoverriding;

public class Xyz extends Abc{
	
	
	int m=54;
	//method overriding
	/*@Override
	public int add(int x, int y)
	{
		System.out.println("Child Class Method");
		return (x+y);
	}*/
	
	public int sub(int x, int y)
	{
		return (x-y);
	}
	
	public static void main(String[] args) {
		/*
		//child class obj
		Xyz x1=new Xyz();
		int z=x1.add(89, 69);   //parent
		x1.sub(56, 78); 		//child
		System.out.println("Sum = "+z);
		
		//parent class obj
		Abc a1=new Abc();
		int w=a1.add(35, 35);
		System.out.println("Sum = "+w);
		
		//parent class ref to child class obj
		Abc a2=new Xyz();		//upcasting
		System.out.println(a2.z);
		int r=a2.add(15, 15);
		System.out.println("Sum ="+r);
		*/
		
		Abc a2=new Abc();
		Xyz x3=(Xyz)a2;			//downcasting
		System.out.println(x3.m);
		System.out.println(x3.z);
		x3.add(58, 25);
		x3.sub(36, 25);
	}
}







