package Interfaces;

public class Connect implements Bike,car
{

	public static void main(String[] args) 
	{
		Connect obj=new Connect();
		obj.hello();
		obj.hello1();
	
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Connected to a interface class ");
	}

	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		System.out.println("Connected multiple inheritance");
		
	}

}
