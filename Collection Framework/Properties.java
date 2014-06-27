/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
class Main
{
	static File file;
	static void saveProperties(Properties p)throws IOException
	{
		FileOutputStream fr=new FileOutputStream(file);
		p.store(fr,"Properties");
		fr.close();
		System.out.println("After saving properties:"+p);
	}
	static void loadProperties(Properties p)throws IOException
	{
		FileInputStream fi=new FileInputStream(file);
		p.load(fi);
		fi.close();
		System.out.println("After Loading properties:"+p);
	}
	public static void main(String... args)throws IOException
	{
		file=new File("property.dat");
		Properties table=new Properties();
		table.setProperty("Shivam","Bane");
		table.setProperty("CS","Maverick");
		System.out.println("Properties has been set in HashTable:"+table);
		//saving the properties in file
		saveProperties(table);
		//changing the property
		table.setProperty("Shivam","Swagger");
		System.out.println("After the change in HashTable:"+table);
		//saving the properties in file
		saveProperties(table);
		//Loading the saved properties
		loadProperties(table);
	}
}
