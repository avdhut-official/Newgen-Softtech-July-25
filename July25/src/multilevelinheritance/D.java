package multilevelinheritance;

public class D extends C{

	public int m=12;
	public void div()
	{
		System.out.println("Inside Class D : "+m);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1=new D();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
	}

}
