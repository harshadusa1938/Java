package com.general;

public class p1 
{
	private String firstname;
	private String lastname;
	private static int count=0;
	
	public p1(String first, String last)
	{
		firstname=first;
		lastname=last;
		++count;
		System.out.printf("Employee Constructor: %s, %s; count=%d", firstname,lastname,count);
	}
	
	
	public String getFirstname()
	{
		return firstname;
	}
	
	public String getLastname()
	{
		return lastname;
		
	}
	
	public static int getCount()
	{
		return count;
		
	}
	
}
