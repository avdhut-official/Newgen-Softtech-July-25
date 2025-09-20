package arrayexamples;
public class ElementDuplicate {
	public static void main(String[] args) {
		int array_x[]= {25,36,78,25,36,44,55,99,25};
		int num=108;
		int count=0;
		for(int i:array_x)
		{
			if(i==num)
			{
				count++;		//count+1
			}
		}
		System.out.println(count);
	}
}