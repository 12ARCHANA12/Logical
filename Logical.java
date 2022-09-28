package com.src;
import java.util.Scanner;

public class Logical {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		System.out.println("Enter the third number");
		int num3=sc.nextInt();
		System.out.println("Performing Or operation");
		//using logical Or to verify the constraints
		if((num1<num2)||(num2==num3))
		{
			int sum=num1+num2+num3;
			System.out.println("The sum is :" +sum);
		}
		
		else {
				System.out.println("False condition");
			
		}
		System.out.println("Performing And operation");

		//using logical And to verify the constraints
		if((num1<num2)&&(num2==num3))
		{
			int sum=num1+num2+num3;
			System.out.println("The sum is :" +sum);
		}
		
		else {
				System.out.println("False condition");
			
		}
		System.out.println("Performing Not operation");

		//performing Not operator
		System.out.println("!(num1<num2)="+!(num1<num2));
		System.out.println("!(num2>num3)="+!(num2>num3));

	}
 
}
	
