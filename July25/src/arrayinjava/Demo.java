package arrayinjava;

import arrayexamples.SearchingElement;

public class Demo {
	
	public static void main(String[] args) {
		//scenario 1 - creating array
		int emp_number[]=new int[10];
		emp_number[0]=25;
		emp_number[1]=35;
		emp_number[2]=45;
		emp_number[3]=55;
		emp_number[4]=65;
		emp_number[5]=75;
		emp_number[6]=85;
		emp_number[7]=95;
		emp_number[8]=105;
		emp_number[9]=115;
		
	/*	System.out.println(emp_number[0]);
		System.out.println(emp_number[1]);
		System.out.println(emp_number[2]);
		System.out.println(emp_number[3]);
		System.out.println(emp_number[4]);
		System.out.println(emp_number[5]);*/
		
		//scenario 2
		int emp_pincode[]= {411015,411011,411001,411002,411003,411004,411005,411006,411007};
	//	System.out.println(emp_pincode[3]);
		//System.out.println(emp_pincode[4]);
		
		//to print all values in array for emp_number
		
		for(int i=0;i<emp_number.length;i++)
		{
			System.out.println(emp_number[i]);
		}
		
		//to print all values in array for emp_code
		for(int j=0;j<emp_pincode.length;j++)
		{
			System.out.println(emp_pincode[j]);
		}
		
	}

}







