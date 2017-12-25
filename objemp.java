package object;

public class objemp
{

	public static void main(String[] args) 
	{
		objempclass s1 = new objempclass();
		s1.emp_id=100;
		s1.emp_name="Harshad";
		s1.emp_city="Albany";
		s1.emp_State="New York";
		s1.emp_Country="United State";
		s1.emp_salary=10000;
		s1.emp_bonus=500;
		s1.calculationemp();
		
		System.out.println(s1.emp_id);
		System.out.println(s1.emp_name);
		System.out.println(s1.emp_city);
		System.out.println(s1.emp_State);
		System.out.println(s1.emp_Country);
		System.out.println(s1.emp_total);
	
	}

}
