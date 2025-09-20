package basicsofjava;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day=1;
		switch(day)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			default:
				System.out.println("Provide correct day");
				break;
		}
		
		char day_c='m' ;
		switch(day_c)
		{
			case 'M': 
			case 'm':
				System.out.println("Monday");
				break;
			case 'T':	
			case 't':
				System.out.println("Tuesday");
				break;
			default:
				System.out.println("Provide correct day");
				break;
		}
	}

}







