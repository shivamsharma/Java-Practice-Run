import java.util.Scanner;
class Area
{
	final float PI=3.14f;
	void area_of_circle(double radius)
	{
		System.out.println("Area of Circle is:"+(PI*radius*radius));
	}
	void area_of_cylinder(double radius ,double height)
	{
		System.out.println("Area of Cylinder is:"+(PI*radius*radius*height));
	}
}

class Assign2_4
{
	public static void main(String arg[])
	{
		Area obj=new Area();
		double r1,r2,h2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle and radius of cylinder and and height of cylinder in order");
		r1=sc.nextInt();
		r2=sc.nextInt();
		h2=sc.nextInt();
		obj.area_of_circle(r1);
		obj.area_of_cylinder(r2,h2);
	}
} 