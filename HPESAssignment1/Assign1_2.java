class Assign1_2
{
	public static void main(String ...args)
	{ int a,b,c;
		System.out.println("Enter two no.s");
                String s=System.console().readLine(" ");
		a=Integer.parseInt(s);
		String t=System.console().readLine("");
		b=Integer.parseInt(t);
		c=(a>b)?b:a;
		System.out.println("Smallest no between two is:"+c);
	 }
}