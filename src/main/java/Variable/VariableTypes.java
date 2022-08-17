package Variable;

public class VariableTypes //classname-variabletypes
{
	
	static int a=10;//static variable
	
	public void user() //method creation
	{
		int av=1000;//local variable
		System.out.println(av);
		String name="Manoj"; //local variable
		System.out.println(name);
		
	}

	public static void main(String[] args) 
	{
		System.out.println(a);
		double c=98.8;//global or instance
		VariableTypes obj=new VariableTypes();//object creation
		obj.user();
		System.out.println(c);
		
	}
}




//Variable:
//
//three types of variables used in java:
//
//1.static  variable
// must be used in Static keyword...Constants
//
//
//2.local variable
//inside the method........
//
//
//3.global variable or instance variable
//
//inside tha class but outside the method
//	
//
//
//
//method:
//method is used to perfome a particular task......
//
//syntax:
// access modifier  return type userdefined name()
//{
//fields,statment,declared
//}
//
//public void maria(arguments(parameter))
//{
//int a=10;
//sysout(a);
//}
//
//
//
//
//object: object is created by class,but used in method.....
//new-memory allocated at runtime
//syntax:
//classname objectname(udn)=new classname();
//
//example:
//Variables obj=new Variables();
