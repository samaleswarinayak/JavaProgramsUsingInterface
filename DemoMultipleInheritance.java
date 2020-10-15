/*Use of multiple inheritance through interface in java*/

interface FirstInterface1
{
	void m1();
}
interface SecondInterface1
{
	void m2();
}
class TestInterface1
{
	void show()
	{
		System.out.println("Class method");
	}
}
class MultipleInheritance extends TestInterface1 implements FirstInterface1,SecondInterface1
{
	public void m1()
	{
		System.out.println("Method of parent interface");
	}
	public void m2()
	{
		System.out.println("Method of child interface");
	}
}
class DemoMultipleInheritance
{
	public static void main(String args[])
	{
		MultipleInheritance ob = new MultipleInheritance();
		ob.m1();
		ob.m2();
		ob.show();
	}
}