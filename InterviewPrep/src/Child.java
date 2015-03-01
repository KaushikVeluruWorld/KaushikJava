
public class Child extends AbstractParent{

	Child()
	{
		//super();
		System.out.println("child");
	}
	
	/*Child(String name)
	{
		System.out.println("child name is "+name);
	}*/
	
	public static void main(String args[])
	{
		Child child=new Child();
	}
}
