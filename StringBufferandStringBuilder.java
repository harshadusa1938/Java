package com.general;

public class StringBufferandStringBuilder 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// String Buffer
		StringBuffer buffer= new StringBuffer("Harshad"+ " ");
		buffer.append("Patel");
		System.out.println(buffer);

		// String Builder
		StringBuilder builder=new StringBuilder("Asha"+ " ");
		builder.append("Patel");
		System.out.println(builder);
		
	}

}
