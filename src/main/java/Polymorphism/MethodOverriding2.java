package Polymorphism;

import java.lang.reflect.Method;

public class MethodOverriding2 extends MethodOverriding1
{
	public void Bike(int a)
	{
		System.out.println("My favoriate bike is Plusars");
	}
	public static void main(String[] args)
	{
		MethodOverriding2 obj=new MethodOverriding2();
		obj.Bike(78);
		MethodOverriding1 obj1=new MethodOverriding2();//upcasting
		obj1.Bike(90);
		MethodOverriding1 obj2=new MethodOverriding1();
		obj2.Bike(89);
		
	}

}
