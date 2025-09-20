package arrayexamples;
import java.util.Scanner;

public class SearchingElementForEach {
	public static void main(String[] args) {
		int array_x[]= {58,35,36,74,96,25,65};
		int search_value=16;
		boolean flag=false;
		//Enhanced For Loop (For Each Loop)
		for(int i:array_x)
		{
			if(i==search_value)
			{
				System.out.println("Element Found");
				flag=true;
				break;		//to break a loop
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not Found");
		}
	}
}