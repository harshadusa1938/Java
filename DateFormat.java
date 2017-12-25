package com.general;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.Format;

public class DateFormat 
{
	
	public static void main(String[] args) 
	{
		String pattern = "MM/dd/yyyy";
		String pattern1 = "MM/dd/yy";
		String pattern2 = "MM:dd:yyyy";
		String pattern3 = "MM:dd:yy";
		String pattern4 = "dd/MM/yyyy";
		String pattern5 = "dd/MM/yy";
		String pattern6 = "dd:MM:yyyy";
		String pattern7 = "dd:MM:yy";
			
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		SimpleDateFormat format1 = new SimpleDateFormat(pattern1);
		SimpleDateFormat format2 = new SimpleDateFormat(pattern2);
		SimpleDateFormat format3 = new SimpleDateFormat(pattern3);
		SimpleDateFormat format4 = new SimpleDateFormat(pattern4);
		SimpleDateFormat format5 = new SimpleDateFormat(pattern5);
		SimpleDateFormat format6 = new SimpleDateFormat(pattern6);
		SimpleDateFormat format7 = new SimpleDateFormat(pattern7);
		
		try {
			Date date = format.parse("02/14/2017");
			Date date1 = format1.parse("02/14/17");
			Date date2 = format2.parse("02:14:2017");
			Date date3 = format3.parse("02:14:17");
			Date date4 = format4.parse("14/02/2017");
			Date date5 = format5.parse("14/02/17");
			Date date6 = format6.parse("14:02:2017");
			Date date7 = format7.parse("14:02:17");
			
//			System.out.println(date);
//			System.out.println(date1);
//			System.out.println(date2);
//			System.out.println(date3);
//			System.out.println(date4);
//			System.out.println(date5);
//			System.out.println(date6);
//			System.out.println(date7);				
//		
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		// formatting
		System.out.println(format.format(new Date()));
		System.out.println(format1.format(new Date()));
		System.out.println(format2.format(new Date()));
		System.out.println(format3.format(new Date()));
		System.out.println(format4.format(new Date()));
		System.out.println(format5.format(new Date()));
		System.out.println(format6.format(new Date()));
		System.out.println(format7.format(new Date()));
	
	}
}