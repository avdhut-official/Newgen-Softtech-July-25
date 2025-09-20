package interfaceex;

public class Triangle extends Demo2 implements Calculate,Demo  {

	@Override
	public double area(int l, int b, int h) {
		// TODO Auto-generated method stub
		System.out.println(m);
		return (l * b * h);
	}
	
	@Override
	public double perimeter(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
		
	@Override
	public boolean isCalculated() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scenario 1
		Triangle t1=new Triangle();
		double area_t=t1.area(25, 15, 15);
		t1.isCalculated();
		t1.perimeter(25);
		t1.getData();
		System.out.println(area_t);
		
		//scenario 2
		Calculate c1=new Triangle();	//reference of interface and object of class
		area_t=c1.area(25, 35, 12);
		System.out.println(area_t);
		System.out.println("Value of m :" +m);
	}
}







