package arrayexamples;

import java.util.Scanner;

public class SearchingElement {
	
	int array_x[]={25,35,68,78,15};
	boolean flag=false;
	
	public void searchElement(int num)
	{
		for(int i=0;i<array_x.length;i++)
		{
			if(array_x[i]==num)
			{
				System.out.println("Element Found at "+i+" location");
				flag=true;
				break;		//to break a loop
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		
	}
	
	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);	//taking input from user
		System.out.println("Input an Int value :");
		int search_value=sc.nextInt();
		SearchingElement s=new SearchingElement();
		s.searchElement(search_value);
	}
}


