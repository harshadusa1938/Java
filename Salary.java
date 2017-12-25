package com.firstsem;


import javax.swing.JOptionPane;
import java.io.*;
import java.text.*;
import java.util.Locale;

public class Salary 

{
    public static void main(String[] args)
    
    {

        String input;
        int x=1,days,salary=1;
        double DayAmount=0,TotalAmount=0;

        input = JOptionPane.showInputDialog("Enter the number of days (BETWEEN ONE AND THIRTY)");
        days = Integer.parseInt(input);
        if (days>0 && days<31) {
            while (x <= days) {
                DayAmount = ((double) salary) / 100;
                TotalAmount = TotalAmount + DayAmount;
                System.out.println("Salary of day " + x + " : " + NumberFormat.getCurrencyInstance().format(DayAmount));
                salary = salary * 2;
                x++;
            }
            System.out.println("The total pay at the end of the period "+ NumberFormat.getCurrencyInstance().format(TotalAmount));
        }
        else
            System.out.println("Incorrect number of days");
    }
}
