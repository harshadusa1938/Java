package com.general;
import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Your First Name:");
		String YourFirstName=input.nextLine();
		
		System.out.println("Enter Your Last Name:");
		String YourLastName=input.nextLine();
		
		System.out.println("Your Full Name is: " + YourFirstName  + YourLastName);
		System.out.println("Your Full Name is: " + YourFirstName  + " "+ YourLastName);
		System.out.println("Hi,"+ YourFirstName+" "+ YourLastName+" How are you ?");
		
	}

}
