import java.io.*;
class BoxDemo
{
	public static void main(String args[])
	{	Box b=new Box();
		Box a=new Box();
		double vol1,vol2;
		vol1=b.volume();
		vol2=a.volume();
		System.out.println("Volume of Box A="+vol1);
		System.out.println("Volume of Box B="+vol2);
	}
}
class Box
{
	double width,height,depth;
	void etDim(double w,double h,double d)
	{ width=w;height=h;depth=d;

	}
	double volum()
{
return width*height*depth;
}}

