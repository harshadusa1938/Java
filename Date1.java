package com.general;
	import java.text.Format;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class Date1 {
	  public static void main(String[] argv) throws Exception {

	    Format formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z");
	    Date date = (Date) formatter.parseObject("Tue, 29 Jan 2004 21:14:02 -0500");
	  }
	}

