package com.harshad.generaldemo;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {

		// Create a Scanner Object to obtain
		// User Input from console
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the starting year : ");
		// Give the startYear value in int
		int startYear = scanner.nextInt();

		System.out.println("Enter the ending year : ");
		// Give the endYear value in int
		int endYear = scanner.nextInt();

		// To check whether a year is LeapYear or not
		// have a boolean variable
		boolean isLeapYear;

		// Loop the years from start to end year
		// and display whether its leap year or not
		for (int i = startYear; i < endYear + 1; i++) {

			// 1. Check : years remainder is zero when
			// divided by 4
			isLeapYear = (i % 4 == 0);
			// 2. Check : return true, when years remainder
			// should not be equal to 0 when divided
			// by 100 and result of previous check is true
			isLeapYear = isLeapYear && (i % 100 != 0);

			// 3. Check : return true, when years remainder
			// is equal to 0 when divided by 400 or whats the
			// boolean value from previous check
			isLeapYear = isLeapYear || (i % 400 == 0);
			// Display whether years are leap or not sequentially
			System.out.println(i + " is a leap year : " + isLeapYear);
		}
	}
}