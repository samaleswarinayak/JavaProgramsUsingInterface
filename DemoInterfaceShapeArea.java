/*Use of Abstract keyword in java */

import java.util.*;
interface ShapeAbstract
{
	abstract void input();
	abstract void area();
	abstract void printarea();
}
class Rectangle1 implements ShapeAbstract
{
	int side1,side2;
	int res;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two sides of rectangle");
		side1 = sc.nextInt();
		side2 = sc.nextInt();
	}
	public void area()
	{
		res = side1 * side2;
	}
	public void printarea()
	{
		System.out.println("Area of rectangle is "+res);
	}

}
class Triangle1 implements ShapeAbstract
{
	int side1,side2;
	double res;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and height of triangle");
		side1 = sc.nextInt();
		side2 = sc.nextInt();
	}
	public void area()
	{
		res = 0.5 * side1 * side2;
	}
	public void printarea()
	{
		System.out.println("Area of triangle is "+res);
	}

}
class Square1 implements ShapeAbstract
{
	int side1;
	int res;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square");
		side1 = sc.nextInt();
	}
	public void area()
	{
		res = side1 * side1;
	}
	public void printarea()
	{
		System.out.println("Area of square is "+res);
	}
}
class DemoInterfaceShapeArea
{
	public static void main(String args[])
	{
		ShapeAbstract ob;//Reference of interface
		ob = new Rectangle1();//Upcasting
		ob.input();
		ob.area();
		ob.printarea();
		
		ob = new Triangle1();//Upcasting
		ob.input();
		ob.area();
		ob.printarea();
		
		ob = new Square1();//Upcasting
		ob.input();
		ob.area();
		ob.printarea();
	}
}