import java.util.Scanner;

class A4
{
String s1,s2;
char c;
int occurence;
void input()
{
 s1=System.console().readLine("enter a string");
 s2=System.console().readLine("enter the character to be searched");
 c=s2.charAt(0);
 
}

void check()
{
System.out.println("the character occurs at position...");

for(int i=0;i<s1.length();i++)
{

if(s1.charAt(i)==c)
{occurence++;
System.out.println("\t"+(i+1));
}



}

System.out.println("The character occurs "+occurence+" times");
}

public static void main(String...arg)
{
A4 obj = new A4();
obj.input();
obj.check();
}
}

