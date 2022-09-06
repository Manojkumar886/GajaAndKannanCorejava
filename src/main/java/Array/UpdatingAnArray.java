package Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray {

	public static void main(String[] args) 
	{
		String [] familymembers= {"Manojkumar","Annamalai","Gajaraja","Aarthi"};
		System.out.println("Before Updating Values");
		System.out.println(Arrays.toString(familymembers));
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us what is position to update");
		int pos=scan.nextInt();
		System.out.println("What is update/replace value");
		String name=scan.next();
		
		familymembers[pos]=name;
		
		System.out.println("After updating Values");
		System.out.println(Arrays.toString(familymembers));

	}

}
