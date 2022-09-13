package Constructor;

public class ParameterizedConstructor
{
	int a;
	String name;
	public ParameterizedConstructor(int a,String name)
	{
		this.a=a;
		this.name=name;
		System.out.println(a+"  -my number");
		System.out.println(name+" -My name");
	}

	public static void main(String[] args) 
	{
		
		ParameterizedConstructor obj=new ParameterizedConstructor(1,"Gajarajan");
		
	}

}
