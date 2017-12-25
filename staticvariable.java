package staticvariable;

public class staticvariable 
{
	int rollno;
	String student_name;
	String student_city;
	static String college_name="The College Of Saint Rose, Albany, New York, USA";
	
	staticvariable(int rollno, String student_name, String student_city)
	{
		this.rollno=rollno;
		this.student_name=student_name;
		this.student_city=student_city;
	//	this.college_name=college_name;
		
	}
	
	void show()
	{
		System.out.println(rollno+" "+student_name+" "+student_city+" "+college_name);
	}
	
	public static void main(String[] args) 
	{
		staticvariable s1= new staticvariable(101, "Harshad", "New York");
		staticvariable s2= new staticvariable(102, "Rahul", "New Jersey");
		
		s1.show();
		s2.show();
		

	}

}
