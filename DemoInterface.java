/*Use of interface in java*/

interface ABC
{
	int no1=20;//public static final
	void movement();//default access modifier is public 
	void talk();//Default is abstract
	void disappear();
	void beautiful();
}
class XYZ implements ABC
{
	public void movement()
	{
		//no1++;Cannot modify the value of no1 as it is final
		System.out.println("Value of no1 = "+no1);
		System.out.println("My home can move");
	}
	public void talk()
	{
		System.out.println("My home can talk");
	}
	public void disappear()
	{
		System.out.println("My home can disappear");
	}
	public void beautiful()
	{
		System.out.println("My home is beautiful");
	}
}
class DemoInterface
{
	public static void main(String args[])
	{
		XYZ ob = new XYZ();
		ob.beautiful();
		ob.movement();
		ob.talk();
		ob.disappear();
	}
}