package basicsofjava;

public class B {

	public int x=7;
	
	UserInputEx e1=new UserInputEx();
	
	public void sub()
	{
		e1.square(x);
		System.out.println("Inside sub method of Class B");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1=new A();
		a1.add(12,25);
		MethodOverloadingEx m1=new MethodOverloadingEx();
		m1.add(15.25, 25.36);
		B b1=new B();
		b1.sub();
	}

}