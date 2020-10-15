/*Use of inheritance of interface in java*/

interface FirstInterface
{
	void m1();
}
interface SecondInterface extends FirstInterface
{
	void m2();
}

class TestInterface implements SecondInterface
{
	public void m1()
	{
		System.out.println("Method of parent interface");
	}
	public void m2()
	{
		System.out.println("Method of child interface");
	}
	void show()
	{
		System.out.println("Class method");
	}
}
class DemoInterfaceInheritance
{
	public static void main(String args[])
	{
		TestInterface ob = new TestInterface();
		ob.m1();
		ob.m2();
		ob.show();
	}
}