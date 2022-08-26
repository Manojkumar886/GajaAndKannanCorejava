package ConditionalStatement;

import java.util.Scanner;

public class AllinAll {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Gaja-Enterprises");
		System.out.println("Tell us what is purpose of laptop you need ID/Account/Games/Generaluse");
		String usage=scan.nextLine();
		switch(usage)
		{
		case "IT":
			System.out.println("Your choose to it professional laptop/currently available");
			System.out.println("Tell us what is amount of laptop you need");
			int price=scan.nextInt();
			if(price>15000&&price<50000)
			{
				System.out.println(price+" your price of laptops are Hp,Lenovo,Dell,Sony");
				String model=scan.next();
				switch(model)
				{
				case "Hp":
					System.out.println("Your are choose to hp laptop.That laptop is provide 4gb Ram,I3 processor");
					break;
				case "Dell":
					System.out.println("Your are choose to dell laptop.that laptop is provide 6gbRAM,SD Card,i5 Processor");
					break;
				}
			}
			else if(price<15000)
			{
				System.out.println("Below 15000 laptop is not available");
			}
			else if(price>50000)
			{
				System.out.println("50000 laptops are Apple-some models........");
			}
			else
			{
				System.out.println("Nothing");
			}
			break;
		case "Accounts":
			System.out.println("Your choose to Account professional laptop/currently available");
			break;
		case "Games":
			System.out.println("Your choose to Games professional laptop/currently unavailable");
			break;
		case "Generaluse":
			System.out.println("Your choose to generaluse professional laptop/currently available");
			break;
			default:System.out.println("Nothing to search");
		}
	}

}
