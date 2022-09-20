package Inheritance;

public class SingleInheritance02 extends SingleInheritance01
{
	public void child()
	{
		System.out.println("my name is child method");
	}
	public static void main(String[] args) 
	{	
		SingleInheritance02 obj=new SingleInheritance02();
		obj.child();
		obj.parent();	
	}

}
