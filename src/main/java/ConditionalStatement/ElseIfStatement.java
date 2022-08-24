package ConditionalStatement;

public class ElseIfStatement {

	public static void main(String[] args) 
	{
		String statename="Tamilnadu";
		int a1=1000;
		int b1=200;
		
		if(statename=="Kerala")
		{
			System.out.println("Kerala  is not mystate");
		}
		else if(statename=="Bihar")
		{
			System.out.println("Yes bihar is not my state");
		}
		else if(a1<b1)
		{
			System.out.println("a is biggest value");
		}
		else if(a1<b1)
		{
			System.out.println("b is biggest value");
		}
		else
		{
			System.out.println("All condition is false");
		}
		
		
		
	}

}
