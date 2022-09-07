package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SerachingAnArray {

	public static void main(String[] args) 
	{
		String [] HeroName= {"Vijay","Ajith","Rajini","Kamal","Vikram","Suriya","Jeeva"};
		Scanner scan=new Scanner(System.in);
		
		System.out.println(HeroName.length);
		System.out.println("Tell us What is Your favoriate actor");
		String favor=scan.next();
		
		for(int pos=0;pos<HeroName.length;pos++)
		{
			if(favor.equalsIgnoreCase(HeroName[pos]))
			{
				System.out.println(favor+" Actor is founded");
				return;
			}
//			else
//			{
//				System.out.println(favor+" acot is not founded");
//			}
		}
		System.out.println(favor+" actor is not founded");
				
	}

}
