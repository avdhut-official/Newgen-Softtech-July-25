package arrayexamples;

public class SimpleSearchingExample {
	
	public static void main(String[] args) {
	
		int array_x[]={25,35,68,78,15};
		boolean flag=false;
		int search_value=85;
		
		for(int i=0;i<array_x.length;i++)
		{
			if(array_x[i]==search_value)
			{
				System.out.println("Element Found");
				flag=true;
				break;		//to break a loop
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}
}
