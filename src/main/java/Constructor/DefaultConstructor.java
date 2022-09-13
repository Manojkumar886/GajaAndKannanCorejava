package Constructor;

public class DefaultConstructor 
{
	int a;
	String name;
	
	public void method1()
	{
		
		System.out.println("Welcome");
	}
	
	public DefaultConstructor()
	{
		System.out.println(a);
		System.out.println(name);
		System.out.println("GajaRajan");
	}

	public static void main(String[] args) 
	{
		DefaultConstructor obj=new DefaultConstructor();
	}

}
