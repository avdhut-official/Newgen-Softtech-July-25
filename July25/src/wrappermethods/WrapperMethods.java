package wrappermethods;

public class WrapperMethods {
	
	public static void main(String[] args) {
		
		//String --> int
		
		String num1="10";
		String num2="30";
		System.out.println(num1+num2);
		
		int x=Integer.parseInt(num1);
		int y=Integer.parseInt(num2);
		System.out.println(x+y);
		
		//String ---> double
		String num3="25.26";
		String num4="29.76";
		
		double cal_1=Double.parseDouble(num3);
		double cal_2=Double.parseDouble(num4);
		System.out.println(cal_1-cal_2);
	
		
		//String ---> Boolean
		String s="true";	//other than true, for any other string we will get false
		boolean z=Boolean.parseBoolean(s);
		System.out.println(z);
		System.out.println(Boolean.parseBoolean(s));
		
		
		//int, double, float, boolean --> String
		int q=89;
		double t=56.25;
		boolean b=true;
		char e='e';
		
		String str3=String.valueOf(q);
		System.out.println(str3);
		System.out.println(String.valueOf(t));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(e));
	}
}




