package com.general;

public class Arrayofobject
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		studen s= new studen("Harshad", 101);
		studen s1= new studen("Asha", 102);
		studen s2= new studen("Rahul", 103);
		
		/*System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		*/
		
		studen[] stu = new studen[3];
		stu[0]=s;
		stu[1]=s1;
		stu[2]=s2;
		
		for(studen sobj : stu)
		{
			System.out.println(sobj);
			
		}
		
	}
}
	class studen
	{
		String student_name;
		int roll_no;
		public studen(String student_name, int roll_no) {
			super();
			this.student_name = student_name;
			this.roll_no = roll_no;
		}
		@Override
		public String toString() {
			return "studen [student_name=" + student_name + ", roll_no=" + roll_no + "]";
		}
		
		
	}


