class Assign5_1
{
	static int length(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		int len=sb.length();
		return len;
	}
	static void reverse(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();
		System.out.println(sb);
	}
	public static void main(String ...a)
	{
		String s="STRING REVERSE";
		System.out.println("STRING REVERSE");
		System.out.println("Length of string="+length(s));
		reverse(s);
	}
}