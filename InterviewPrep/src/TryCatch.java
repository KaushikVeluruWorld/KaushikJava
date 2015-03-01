
public class TryCatch implements Cloneable{

	String test;
	
	public TryCatch() {
		this.test="kaushik";
	}
	public static void main(String args[])
	{
		System.out.println(function());
		TryCatch tc =new TryCatch();
		System.out.println("string representation of Try Catch object: "+tc.toString());
		try
		{
			TryCatch tc2=tc.clone();
			TryCatch tc3=new TryCatch();
			System.out.println("string: "+tc.toString());
			System.out.println("cloned string: "+tc2.toString());
			System.out.println("new object: "+tc3.toString());
			if(tc.clone().equals(tc))
			{
				System.out.println("clone is same as original");
			}

		}
		catch(CloneNotSupportedException c)
		{
			c.printStackTrace();
		}
	}
	
	public TryCatch clone() throws CloneNotSupportedException
	{
		return (TryCatch)super.clone();
	}
	
	public static int function()
	{
		try
		{
			System.out.println("try");
			
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
			return 10;
		}
	}
}
