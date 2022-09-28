package Polymorphism;

public class MethodOverloading 
{
	public void car(int a)
	{
		System.out.println("This is a integer method ");
	}
	public void car(char b)
	{
		System.out.println("This is a charcter mathod");
	}
	public void car(String c)
	{
		System.out.println("This is a String method");
	}

	public static void main(String[] args) 
	{
		
		MethodOverloading over=new MethodOverloading();
		over.car("fdhj");
		
	
	}

}
