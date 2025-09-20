package arrayexamples;

import java.util.Arrays;

public class SortingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[]= {5,8,3,4,2};
		System.out.println("Before Sorting");
		
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(x));
		
		
		//Sorting Strings
		String city[]= {"Pune","Mumbai","Nagpur","Latur","Kolhapur"};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(city));
		Arrays.sort(city);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(city));
	}
}





