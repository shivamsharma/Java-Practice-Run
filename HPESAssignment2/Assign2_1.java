import java.util.Scanner;
class Employee
{
	private int EmpID,Salary;
	private String EmpName, Bloodgroup,DeptID;
	public void Input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee ID No.:-");
		EmpID=sc.nextInt();
		System.out.println("Enter the Employee Name No.:-");
		EmpName=sc.next();
		System.out.println("Enter the Employee Department ID:-");
		DeptID=sc.next();
		System.out.println("Enter the Employee Salary No.:-");
		Salary=sc.nextInt();
		System.out.println("Enter the Employee Bloodgroup No.:-");
		Bloodgroup=sc.next();	
	}
	public void Output()
	{
		System.out.println("Entered details of employee:-\nEmpID="+EmpID+"\nEmployee Name:-"+EmpName+"\nEmployee department ID="+DeptID+"\nEmployee salary="+Salary+"\nEmployee Bloodgroup="+Bloodgroup);
	}
	public static void main(String arg[])
	{
		Employee em[]=new Employee[1];
		em[0]=new Employee();
		em[0].Input();
		em[0].Output();
	}
}