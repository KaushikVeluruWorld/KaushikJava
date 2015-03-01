
public class Outer {

	String outerString="outer";
	class Inner
	{
		String innerString="inner";
	}
	
	public static void main(String args[])
	{
		Outer.Inner inner=new Outer().new Inner();
		System.out.println(inner.innerString);
		
		Outer outer=new Outer();
		System.out.println(outer.outerString);
	}
}
