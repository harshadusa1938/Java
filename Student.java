package com.general;

 public class Student extends Person {
        
    
    public int studentid;
    public int studentphone;
    public int studentaddress;

    public Student(String firstname,String lastname, int id, int ph, int add) {
        super(firstname, lastname);
        studentid = id;
        studentphone = ph;
        studentaddress = add;
    }   
        public void setstudentid(int id) 
    	{
        studentid = id;
    }
        
    public void setstudentphone(int ph)
    	 {
        studentphone = ph;
    }
         
          public void setstudentadrress(int add)
    	 {
        studentaddress = add;
    }
       
   
        

 public int getstudentid()

            {

                return studentid;

            }
public int getstudentphone()

            {

                return studentphone;

            }
            public int getstudentaddress()

            {

                return studentaddress;

            }
            


 }