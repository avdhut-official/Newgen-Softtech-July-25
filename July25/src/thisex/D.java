package thisex;
//understanding this keyword
public class D {

	int d, e;
	public D(int d, int e)
	{
		this.d=d;	//assigning the value
		this.e=e;
	}
	public void displayD()
	{
		System.out.println("value of d :"+d);
		System.out.println("value of e :"+e);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D d1=new D(89,37);		//call the parameterised constructor
		d1.displayD();
		
	}

}




