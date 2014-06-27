class Assign1_4
{
	public static void main(String arg[])
	 { 
	   char a;
           int b;
	   System.out.println("Enter the marks");
           String s=System.console().readLine(" ");
	   b=Integer.parseInt(s);	
           if((b>=90)&&(b<=100))
	   {
		System.out.println("Grade-A");
	   }
	else if((b>=80)&&(b<90))
		{
			System.out.println("Grade-B");
		}

	else if((b>=70)&&(b<80))
		{
			System.out.println("Grade-C");
		}
	else if((b>=60)&&(b<80))
		{
			System.out.println("Grade-D");
		}
	else if((b>=50)&&(b<60))
		{
			System.out.println("Grade-E");
		}
	else if(b<50)
		{
			System.out.println("Grade-F");
			System.out.println("Fail");
		}
	}
}