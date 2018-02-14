package com.harshad.generaldemo;

public class Two_Dimentional_Array {

	
	
	public static void main(String[] args) 
	{
		
		int[][] job = new int[3][3];
			// TODO Auto-generated method stub

		job[0][0]=2;
		job[0][1]=4;
		job[0][2]=8;
		job[1][0]=6;
		job[1][1]=3;
		job[1][2]=1;
		job[2][0]=4;
		job[2][1]=5;
		job[2][2]=10;
		
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				//if(i==j)
			System.out.println(job[i][j]+"\t");
			
			}
			System.out.println("\n");
		}
		
	} 

}
