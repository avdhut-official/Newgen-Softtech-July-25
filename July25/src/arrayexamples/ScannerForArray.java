package arrayexamples;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[]=new int[5];
		x[0]=67;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("Enter Value : ");
			x[i]=sc.nextInt();
		}

		System.out.println("Printing array---");
		System.out.println(Arrays.toString(x));
		
		//Taking input as strings array
		String cities[]=new String[2];
		for(int i=0;i<cities.length;i++)
		{
			System.out.println("Enter Value : ");
			cities[i]=sc.next();
		}
		
		System.out.println("Printing String array---");
		System.out.println(Arrays.toString(cities));
	}
}





