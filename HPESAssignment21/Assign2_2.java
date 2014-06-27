import java.util.Scanner;
class Assign2_2
{
	public static void main(String arg[])
	{
		int num,count=1,i;
		System.out.println("Enetr the no:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int a,b,sum=0;
		a=num;
		while(a/10>0)
		{
			count++;
			a=a/10;
		}
		a=num;
		for(i=0;i<count;i++)
		{
			b=a%10;
			if(b%2!=0)
			{
				sum+=b*b;
			}
			a=a/10;
		}
		System.out.println("SUM IS="+sum);
	}
}