package thisex;

public class C extends B{
	
	int c;
	//default constructor
	public C()
	{
		c=36;
	}
	
	public void display_C()
	{
		System.out.println("Value of C :"+c);
	}
	
	public static void main(String[] args) {
		
		C c1=new C();		//call the default constructor
		
		c1.display_A();		//old call
		c1.display_B();
		c1.display_C();
		c1.a=95;
		c1.display_A();		//new call
		
		C c2=new C();
		c2.display_A();
		c2.display_B();
		c2.display_C();
	}
}




