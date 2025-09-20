package basicsofjava;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks=58;
		int ptr=marks/10;
		
		switch(ptr)
		{
			case 10:
			case 9:
				System.out.println("Grade A");
				break;
			case 8:
			case 7:
				System.out.println("Grade B");
				break;
			case 6:
			case 5:
			case 4:	
				System.out.println("Grade C");
				break;
			default:
				System.out.println("Fail");
				break;
			
		}
		
	}

}
