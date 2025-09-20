package arrayinjava;

public class TwoDimensional {
	
	
	public static void main(String[] args) {
		
		//scenario 1
		
		int x[][]=new int[2][3];		//2 rows and 3 columns
		x[0][0]=25;
		x[0][1]=35;
		x[0][2]=45;
		
		x[1][0]=55;
		x[1][1]=65;
		x[1][2]=75;
		
		System.out.println(x[0][2]);
		System.out.println(x[1][2]);
		
		//scenario 2
		int y[][]= {{1,2},{3,4},{5,6}};
		System.out.println(y[1][1]);
		
		//Rows
		for(int i=0;i<2;i++)
		{
			//columns
			for(int j=0;j<3;j++)
			{	
				System.out.println(i+","+j+":"+x[i][j]);
			}
		}
		
		for(int i=0;i<3;i++)
		{
			//columns
			for(int j=0;j<2;j++)
			{	
				System.out.println(y[i][j]);
			}
		}
	}

}





