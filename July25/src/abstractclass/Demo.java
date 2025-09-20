package abstractclass;

public class Demo extends Employee{

	public Demo()
	{
		System.out.println("inside Demo constructor");
	}
	
	@Override
	public String getPersonalDetails() {
		// TODO Auto-generated method stub
		return "Avdhut";
	}
	
	public static void main(String[] args) {
		Demo d1=new Demo();	//call to Demo constructor
		String name=d1.getPersonalDetails();
		System.out.println(name);
		int x=d1.getAccount();
		System.out.println(x);
	}
}
