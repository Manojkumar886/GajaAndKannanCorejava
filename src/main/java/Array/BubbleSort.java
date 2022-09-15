package Array;

import java.util.Arrays;

public class BubbleSort {
	
	public void bubble(int[] arr1)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length-i-1;j++)
			{
				if(arr1[j]>arr1[j+1])
				{
					int swap=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=swap;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] arr= {5,3,1,2,8,7};
		System.out.println(Arrays.toString(arr));
		
		BubbleSort sort=new BubbleSort();
		sort.bubble( arr);
		System.out.println("After Sorting"+Arrays.toString(arr));
	}

}
