package hierarchicalinheritance;

public class Demo {

	private int n_pri=76;
	public float m_pub=87.56f;
	protected boolean e_pro=true;
	double i_def=56.76;
	

	private void getPrivate()
	{
		System.out.println("In private method");
	}
	
	public void getPublic()
	{
		System.out.println("In public method");
	}
	
	void getDefault()
	{
		System.out.println("In default method");
	}
	protected void getProtected()
	{
		System.out.println("In protected method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
	}
}







