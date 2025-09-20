package basicsofjava;

public class Test {
	
	
	public void add(int x, int y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String []args)
	{
		Test t1=new Test();	//create an object of class
		t1.add(35,20);
	}
}
