package Array;

import java.util.Arrays;
//Decendion Order ryour values can be display in default
public class SelectionSorting {
	
	public void SelectionProcess(int [] arr1)
	{
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
				{
					arr1[i]^=arr1[j];
					arr1[j]^=arr1[i];
					arr1[i]^=arr1[j];
				}
			}
		}
		
	}

	public static void main(String[] args) 
	{
		int [] arr= {55,20,50,30,10};
		System.out.println(Arrays.toString(arr));
		SelectionSorting obj=new SelectionSorting();
		obj.SelectionProcess(arr);
		System.out.println("After the Soring a Array  value"+Arrays.toString(arr));
		

	}

}
