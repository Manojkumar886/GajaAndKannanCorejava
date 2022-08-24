package ConditionalStatement;

public class NestedIfStatement {

	public static void main(String[] args) 
	{
		float height=165.67f;
		float weight=76.5f;
		
		if(height==weight)
		{
			if(weight<height)
			{
				System.out.println("Yes height is highest then weight");
			}
		}
		else
		{
			System.out.println("Your Answer is Wrong");
		}

	}

}
