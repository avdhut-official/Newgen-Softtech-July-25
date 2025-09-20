package typecasting;

public class UpandDownCasting {
	
	public static void main(String[] args) {
		
		//Up Casting ---> Smaller to Larger one --->
		int x=44;
		long r=x;
		System.out.println(r);
		
		float z=89.65f;
		double q=z;
		System.out.println(q);
		
		//Down Casting ----> Larger to Smaller --->
		long a=10000;
		int b=(int)a;		//explicit conversion
		System.out.println(b);
		
		double c=125.58567890;
		float d=(float)c;
		System.out.println(d);
		
		double e=125.78;
		long f=(long)e;
		System.out.println(f);
	}
}


