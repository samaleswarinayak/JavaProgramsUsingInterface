/*Use of interface in java*/

interface ABC1
{
	int no1=20;//public static final
	void movement();//default access modifier is public 
	void talk();//Default is abstract
	void disappear();
	void beautiful();
}
abstract class XYZ1 implements ABC1
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
}
class PQR1 extends XYZ1
{
	public void beautiful()
	{
		System.out.println("My home is beautiful");
	}
}
class DemoInterfaceAbstract
{
	public static void main(String args[])
	{
		PQR1 ob = new PQR1();
		ob.beautiful();
		ob.movement();
		ob.talk();
		ob.disappear();
	}
}