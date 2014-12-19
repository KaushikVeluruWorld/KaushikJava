import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;


public class HashTableDemo {

	private void display(Hashtable h)
	{
		String str;
		Enumeration e=h.keys();
		while(e.hasMoreElements())
		{
			str=(String)e.nextElement();
			System.out.println(str);
		}
	}
	
	public static void main(String args[])
	{
		Hashtable<String, Integer> ht= new Hashtable<String, Integer>();
		ht.put("kaushik", 1);
		ht.put("veluru", 1);
		
		//display all rows in hashtable
		Enumeration names=ht.keys();
		String str;
		while(names.hasMoreElements())
		{
			str=(String)names.nextElement();
			System.out.println(str +": "+ht.get(str));
		}
		
		
		String input="kaushik";
		if(ht.containsKey(input))
		{
			ht.put(input, ht.get(input)+1);
		}
	
		
		System.out.println("after insertion:");
		Enumeration names1=ht.keys();
		String str2;
		while(names1.hasMoreElements())
		{
			str2=(String)names1.nextElement();
			System.out.println(str2 +": "+ht.get(str2));
		}
	
		
	}
	
}
