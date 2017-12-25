package com.general;

import java.io.File;
import java.io.IOException;

public class File_Create
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		File file= new File("E:\\file2.txt");
	
		try {
			if(file.createNewFile())
			{
				System.out.println("File is Created");
			}else
			{
				
				System.out.println("File is Already Exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
