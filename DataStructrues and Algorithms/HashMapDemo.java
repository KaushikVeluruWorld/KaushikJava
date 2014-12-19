import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMapDemo {

	public static void main(String args[])
	{
		String[] books={"maths","science","maths","science","maths","social","english","GK","maths","biology"};
		
		//inserting the books into inventory (HashMap)
		HashMap<String, Integer> inventory =new HashMap<String, Integer>();
		for(int i=0;i<books.length;i++)
		{
			if(inventory.isEmpty())
			{
				//Put the first book in the list into inventory
				inventory.put(books[0], 1);
			}
			else
			{
				if(inventory.containsKey(books[i]))
				{
					//Increment the number of books with the given key.
					inventory.put(books[i],inventory.get(books[i])+1);
				}
				else
				{
					//Insert the new book into the inventory with a value 1.
					inventory.put(books[i], 1);
				}
			}
		}
		
		
		String str;
		//display the inventory
		Iterator<String> e=inventory.keySet().iterator(); //An Iterator is used because the key-value pair
		                                                  //is stored as Map.entry in HashMap which is why we 
		                                                  //cannot take a set of keys.
		while(e.hasNext())
		{
			str=e.next();
			System.out.println(str +":"+inventory.get(str));
		}
	}
	
}
