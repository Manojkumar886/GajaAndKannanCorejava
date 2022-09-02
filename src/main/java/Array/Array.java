package Array;

import java.util.Arrays;

//Array is set of values is referenced by using a single variable name combined with index number..
public class Array {

	public static void main(String[] args) 
	{
		int a=10;
		//array symbol[]
		int [] a1= {12,10,203,234,678};//One format of array creation
		
		
		int [] a2=new int[15];//Another format of array creation
		
		//System.out.println(a1.length);
		
//		for(int i=0;i<a1.length;i++)//for loop
//		{
//			System.out.println(a1[i]);
//		}
		
//		for(int hoi:a1) for-each loop
//		{
//			System.out.println(hoi);
//		}
		System.out.println(Arrays.toString(a1));

	}

}
