package com.general;

public class Person {
    
    
private String firstname;
    private String lastname;
    
    public Person(String n, String ln) {
       firstname = n;
        lastname = ln;
    }
        
       
      
    public void setfirstname(String n) 
    	{
        firstname = n;
    }
        
    public void setlastname(String ln)
    	 {
        lastname = ln;
    }
         
   
        

 public String getfirstname()

            {

                return firstname;

            }
public String getlastname()

            {

                return lastname;

            }
}