package object;

public class objempclass 
{
	
	int emp_id;
	String emp_name;
	String emp_city;
	String emp_State;
	String emp_Country;
	double emp_salary;
	double emp_bonus;
	double emp_total;

	void calculationemp()
	{
		emp_total=emp_salary + emp_bonus;		
	}
}
