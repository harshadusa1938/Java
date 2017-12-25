package object; // declared the packege helloworld

public class objectandclass //Create a Class
{
	int id=1; //Data Member or instance a variable
	String name="Harshad"; // Data Member or instance a variable
	
	public static void main(String[] args) //Method
	{
	System.out.println("====Create an object of this class=======\n");
	
	objectandclass h1=new objectandclass(); // create an object of class objectandclass
	System.out.println(h1.id); // pass the value
	System.out.println(h1.name); // pass the value

	}

}
