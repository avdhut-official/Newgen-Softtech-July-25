package basicsofjava;

public class ControlBasicsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks=68;
		
		//greater than equal to
		if(marks >= 90)	//false
		{
			System.out.println("Grade A");
		}
		else if(marks >=80) //false
		{
			System.out.println("Grade B");
		}
		else if(marks >=70) //false
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
