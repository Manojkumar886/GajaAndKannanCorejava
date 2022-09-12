package Array;

public class JaggedArray {

	public static void main(String[] args) 
	{
		int  arr[][]=new int [3][];//declaring a 2-d array with 2 rows...
		arr[0]=new int[3];//first row three column
		arr[1]=new int[2];//second row two column
		arr[2]=new int[5];
		int count=1;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count+=2;
			}
		}
		
		for( int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i ].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
