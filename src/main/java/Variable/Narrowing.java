package Variable;

public class Narrowing {

	public static void main(String[] args)
	{
		double ba=98.0;
		double ab=ba;
		float a1=(float)ba;
		System.out.println(ba);
		System.out.println(a1);
		
		float b=10.76f;
		int a=(int)b;
		System.out.println("Floating value is"+b);
		System.out.println("Integer value is"+a);
	}

}
