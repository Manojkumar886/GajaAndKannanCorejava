package Scanner;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);//Object creation in Scanner
//		String name="Manojkumar";//normal creation
//		System.out.println("My name is"+name);
		System.out.println("What is Your name");
		String Aname=scan.nextLine();
		System.out.println("Your name is "+Aname);
		System.out.println("What is your age");
		int age=scan.nextInt();
		System.out.println("your age is "+age);
	}

}
