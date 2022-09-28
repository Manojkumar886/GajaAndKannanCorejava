package Abstraction;

public class AccessAbstract extends Abstract1 
{
	public void Gaja()
	{
		System.out.println(" Welcome to Gajarajan");
	}

	public static void main(String[] args) 
	{
		AccessAbstract obj=new AccessAbstract();
		obj.Gaja();
		obj.implementation();
		obj.impleone();
	}

	@Override
	void implementation() {
		// TODO Auto-generated method stub
		System.out.println("This is a Abstract MEthod for no implementation");
	}

}
