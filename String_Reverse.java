package com.harshad.generaldemo;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Harshad";
		
		char[] c= s.toCharArray();
		
		
		for(int i=c.length-1;i>=0;i--)
		{
			
			System.out.println(c[i]);
		}
		
		
	}

}
