package com.firstsem;
/*
*  HW#7 Java Assignment 2
* 8. Sales Tax 
* Mohammed Alhokbani
*
* 10/27/2014
 */

//import java.io.*;
import javax.swing.JOptionPane; 
import java.text.DecimalFormat;
public class SalesTax {
    
    public static void main(String[] args) {
        String input;
    	double purchase;
    	double statetax;
    	double countytax;
    	double totaltax;
    	double totalsale;
    	 
    	DecimalFormat df = new DecimalFormat(); // decimalformat is a class
		df.setMaximumFractionDigits(2); 
			
		input = JOptionPane.showInputDialog("Enter the purchase amount");
        purchase = Double.parseDouble(input); // converts the string into a numeric value.
        
        // calculation
        statetax = purchase*0.04;
        countytax = purchase*0.02;
        totaltax = statetax+countytax;
        totalsale = purchase+totaltax;
        
        // format and print
        System.out.println("The purchase amount : $"+df.format(purchase));
        System.out.println("The state tax : $"+df.format(statetax));
        System.out.println("The county tax : $"+df.format(countytax));
        System.out.println("The total tax : $"+df.format(totaltax));
        System.out.println("The total sale : $"+df.format(totalsale));
        
    }
}