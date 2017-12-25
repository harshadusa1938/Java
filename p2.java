package com.general;

public class p2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println("Employee Before Instatiation %d\n");
		p1.getCount();
		
		p1 p=new p1("Harshad", "Patel");
		p1 pp=new p1("Rahul","Patel");
		
		System.out.println("Employee After Instatiation %d");
		System.out.printf("p.getcount(): %d",+p.getCount());
		System.out.printf("pp.getcount(): %d",+pp.getCount());
				
		p1.getCount();
	}

}
