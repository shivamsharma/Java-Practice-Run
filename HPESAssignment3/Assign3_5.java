import java.util.Scanner;
class Assign3_5
{
	 static int sub[]=new int[5];
	static int total=0;
	static double percent;
	static void marks()
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the marks in 5 subjects:-");
		for(i=0;i<5;i++)
		{
			sub[i]=sc.nextInt();
			total+=sub[i];
		}
	}
	static void percentage()
	{
		percent=total/5;
	}
	static void display()
	{
		int i;
		System.out.print("		MarkSheet\n----------------------\n\nName\t:Rahul Jain\nRoll No:0205ca071101\nCollege  :  IIIT Allahabad College\n\n");
		System.out.print("--------------------\n\n   Subject   :    Marks\n\n");
		for(i=0;i<5;i++)
		{
			System.out.println("Sub"+(i+1)+"\t:\t"+sub[i]);
		}
		System.out.println("--------------------\n Total     :\t"+total);
		System.out.println("Percent\t:\t"+percent+"%");
	}		 
	public static void main(String arg[])
	{
		marks();
		percentage();
		display();
	}
}