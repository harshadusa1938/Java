package com.general;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
  public static void main(String[] argv) throws Exception 
  {

    Format formatter = new SimpleDateFormat("MM/dd/yyyy");
    Date date = (Date) formatter.parseObject("02/14/2017");
    System.out.println(date);
  }
}