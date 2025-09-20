package arrayexamples;

public class PrintingReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array_x[]= {25,36,78,25,36,44,55,99,25};
		
		for(int i=array_x.length-1;i>=0;i++)
		{
			System.out.print(array_x[i]+" ");
		}
		/*
		for(int i=0;i<array_x.length;i++)
		{
			System.out.println(array_x[i]);
		}*/
	}

}
