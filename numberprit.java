package scanner;

import java.util.Scanner;

public class numberprit 
{
private static Scanner sc1;

	public static void main(String[] args) 
	{
		// Number print
		sc1 = new Scanner(System.in);
		double num1,num2,total;
		System.out.println("Enter the First Number:");
		num1=sc1.nextDouble();
		System.out.println("Enter the Second Number:");
		num2=sc1.nextDouble();
		System.out.println("====Resualt is====");
		total=num1+num2;
		System.out.println(total);

	}

}
