
public class MultipleInheritance extends Question {

	public String toString()
	{
		System.out.println("in MI toString");
		return super.toString();
	}
	
	public static void main(String... args)
	{
		MultipleInheritance mi=new MultipleInheritance();
		System.out.println("calling in MI");
		mi.toString();
	}
}
