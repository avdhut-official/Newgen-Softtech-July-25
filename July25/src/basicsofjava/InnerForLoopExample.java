package basicsofjava;

public class InnerForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		for(int i=1;i<=3;i++)		//outer loop
		{
			for(int j=1;j<=3;j++)  	//inner loop
			{
				System.out.println(i+" "+j);
			}
		}
	}
}
