package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	public static int linearsearch(int[] arr1,int value)
	{
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==value)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,45,677,564,5576,4545,3,4,53,5,6,56};
		System.out.println(Arrays.toString(arr));
		
		LinearSearch search=new LinearSearch();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What number is you want");
		int value=scan.nextInt();
		
		System.out.println(value+" is founded by index of"+linearsearch(arr,value));
		
		

	}

}
