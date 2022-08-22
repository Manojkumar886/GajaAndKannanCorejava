package Operators;
//Scanner:
//Scanner is used to get input an runtime..
//Scanner is of the class....
//Scanner---- import java.util.Scanner
//
//int-nextInt
//float-nextFloat
//double-nextDouble
//String-nextLine or next
//
//
//Operators
//---------
//1.Arithametic Operator 	-  		+,-,*,/,%
//2.Assignment Operator	-		Its used to assign a particular two operands(=),Same as Arithametic Operator,+=,-=,*=,/=
//3.Comparision or Relational Operator -	>,<,==,!=,<=,>= 
//4.Logical Operator			-	&&,||,!	(connected with two comparision Operator)		
//5.Bitwise Operator			-
//6.Shift Operator			-


public class LogicalOperator {

	public static void main(String[] args) 
	{	
		int a =10;
		int a1=20;
		
		System.out.println(a<a1&&a1>a);
		System.out.println(a==a1||a!=a1);
		System.out.println(!(a>a1));
	}

}
