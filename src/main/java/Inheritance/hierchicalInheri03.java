package Inheritance;

public class hierchicalInheri03 extends hierchicalInheri01
{
	public void eating()
	{
		System.out.println("Mokey is eating for Banana");
	}
	public static void main(String[] args) 
	{
		hierchicalInheri03 hier=new hierchicalInheri03();
		hier.eating();
		hier.animal();
		
	}

}
