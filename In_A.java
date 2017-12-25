package com.general;

class _A 
{

	public _A()
	{
		System.out.println(1);
		
	}
	
}
class _B extends _A
{
	public _B()
	{
		System.out.println(2);
		
	}
}
class _C extends _B
{
	public _C()
	{
		System.out.println(3);
		
	}
}

public class In_A
{
public static void main(String[] args)
{
	_C c1=new _C();
	
}
}
