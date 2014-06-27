/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.File;
import java.util.Map;
import java.util.HashMap;
class Main
{
	public  static int i=0;
	static boolean check_extension(File file)
	{
		String str=file.getName();
		//System.out.println(str);
		int dot=str.indexOf('.');
		if(str.substring(dot+1).equals("java"))		/********change file type here************/
		{
			return true;
		}
		return false;
	}
	static void count_files(File file,String[][] files)
	{
		if(file.isDirectory()==false)
		{
			if(check_extension(file)==true)
			{
				files[i][0]=file.getName();
				files[i][1]=file.getAbsolutePath();
				i++;
			}
			return ;
		}
		for(File temp:file.listFiles())
		{
			count_files(temp,files);
		}
		return ;
	}
	public static void main(String... args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		File file=new File("d:/study/coding");
		String[][] files=new String[50000][2];
		count_files(file,files);
		Map<String,String> map=new HashMap<String,String>();
		for(int j=0;j<i;j++)
		{
			map.put(files[j][0],files[j][1]);
		}
		System.out.println("Now Search for file with exact name:");
		String word=br.readLine();
		word+=".java";
		System.out.println("File "+word+":"+map.get(word));
	}
}
