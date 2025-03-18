package class1;
class Address
{
	String streetName;
	String city;
	@Override
	public String toString()
	{
		return "StreetName : "+ streetName +"\n"+"City : " +city +"\n"; 
	}
}
class Person
{
	String firstName;
	int age;
	Address address;
	@Override
	public String toString()
	{
		return "FirstName : "+firstName+" \n"+"Age : " +age+" \n"+ address;
	}
}
class employee extends Person
{
	String empId;
	double salary;
	@Override
	public String toString()
	{
		return super.toString()+"\n"+"Employee id : "+empId+"\n"+"Salary : "+salary;
	}
}
public class A13
{
	public static void main(String[] args)
	{
		Address add=new Address();
		add.streetName="B.T.M";
		add.city="Banglore";
		employee emp=new employee();
		emp.address=add;
		emp.firstName="abc";
		emp.age=25;
		emp.empId="emp101";
		emp.salary=40000.00;
		System.out.println(emp);
	}
}