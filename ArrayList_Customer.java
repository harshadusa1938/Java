package com.harshad.generaldemo;

import java.util.ArrayList;

public class ArrayList_Customer {

	public static void main(String[] args)
	{

		ArrayList<customer> cust = new ArrayList<customer>();
	
		//cust.add(new customer("Harshad", 28));
		//cust.add(new customer("Harshad", 28));
		

		for(customer st: cust)
		{
			System.out.println("Customer Details :-" + st.name+ st.age);
			
		}
	}


	class customer 
	{
		String name;
		int age;

		customer(String name, int age)
		{
			this.name = name;
			this.age = age;
		}
	}
}





