package ConditionalStatement;

import java.util.Scanner;

public class SwitchStatment {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter any one digit number");
		String number=scan.nextLine();
		
		switch(number)
		{
		case "one":
			System.out.println("your value is One-1");
		break;
		case "two":
			System.out.println("your value is Two-2");
		break;
		case "three":
			System.out.println("your value is Three-3");
			break;
		case "34":
			System.out.println("your value is extra value");
			break;
		default:System.out.println("Your value is not eligible");
		}
		

	}

}
