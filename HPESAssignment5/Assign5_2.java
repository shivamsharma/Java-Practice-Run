class Assign5_2
{
	static public void main(String arg[])
	{
		String s=System.console().readLine("Enter the string:-");
		int len=s.length();
		int vow=0,cons=0;
		char temp;
		for(int i=0;i<len;i++)
		{
			temp=s.charAt(i);
			if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
			vow++;
			else cons++;
		}
		System.out.println("No. of vowels are="+vow+"\nNo. of consonants are="+cons);
	}
}