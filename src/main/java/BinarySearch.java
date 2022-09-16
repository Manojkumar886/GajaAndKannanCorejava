

import java.util.Arrays;

public class BinarySearch {
	
	public static int searching(int [] arr1,int low,int high,int user)
	{
		if(low<high)
		{
			int mid=(high+low)/2;
			if(arr1[mid]==user)
			{
				return mid;
			}
			else if(arr1[mid]>user)
			{
			return searching(arr1,low,mid,user);
			}
			else if(arr1[mid]<user)
			{
			return searching(arr1,mid+1,high,user);
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
	int [] arr= {10,20,30,40,50,60,70,80,90,100};
	
	System.out.println(Arrays.toString(arr));
	
	BinarySearch search=new BinarySearch();
	
	System.out.println(" this value is founded by" +search.searching(arr, 0, arr.length, 100));
	}
}
