package basicsofjava;
public class C extends A {

	int x=35;
	public void mul(int m, int n)
	{
		System.out.println(m*n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		c1.add(15, 25);		//call to parent method
		c1.mul(10, 25);
		System.out.println(c1.z +" "+c1.x); //call to parent variable
	}
}






