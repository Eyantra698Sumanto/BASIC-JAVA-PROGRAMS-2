import java.util.Scanner;
class circle
{
	public static void main(String args[])
	{
		double a,c,r;
		System.out.println("Enter the radius");
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		a=3.141*r*r;
		c=2*3.141*r;
		System.out.println("Area of the circle="+a);
		System.out.println("Circumference of the circle="+c);
}}
