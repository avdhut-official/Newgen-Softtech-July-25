package hierarchicalinheritance;

public class Y extends X{
	
	int b=56;
	public void sum()
	{
		System.out.println("Inside Class Y - Sum Method");
	}
	
	public static void main(String[] args) {
		Y y1=new Y();
		y1.square();
		y1.sum();
	}

}
