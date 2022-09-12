package Array;

public class MuldiDimensionalArray {

	public static void main(String[] args)
	{
		int arr[]= {45,67,87,876,678};//Single Dimensional Array
		
		int arr1[][]= {{1,2,3},{2,3,4},{4,5,6}};//Multiddimensional Array
		
		for(int a=0;a<3;a++)//row
		{
			for(int b=0;b<=2;b++)//column
			{
				System.out.print(arr1[a][b]+" ");
			}
			System.out.println();
		}
	}

}
