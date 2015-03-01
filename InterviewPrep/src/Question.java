
public class Question {

	// the output would be string even though there is Object. 
	
	//uncommenting this would make the function call ambiguous
/*	public static void function(Integer inte)
	{
		System.out.println("Integer");
	}
*/	public static void function(Object o)
	{
		System.out.println("Object");
	}
	public static void function(String str)
	{
		System.out.println("string");
	}
	
	public String toString()
	{
		System.out.println("in Question toString");
		return super.toString();
	}
	public static void main(String args[])
	{
		function(null);
	}
}

