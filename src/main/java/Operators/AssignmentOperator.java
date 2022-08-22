package Operators;

public class AssignmentOperator {

	public static void main(String[] args) 
	{
		int a=100;
		float point=98.7f;
		a*=100;
		a/=1000;
		System.out.println("Cannot used assignment operator"+point);
		point+=1.3;
		System.out.println("Assigned"+point);
		
		System.out.println(a);
		
		System.out.println("after division"+a);
	}

}
