package Inheritance;

public class MultiLevelInheritaceS extends MultiLvelevelInheritanceF
{
	public void son()
	{
		System.out.println("my name is Son");
	}

	public static void main(String[] args) 
	{
		
		MultiLevelInheritaceS obj=new MultiLevelInheritaceS();
		obj.gm();
		obj.son();
		obj.Mother();
		
	}

}
