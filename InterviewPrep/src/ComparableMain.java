import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ComparableMain {

	
	public static void main(String... args)
	{
		CountryComparable india=new CountryComparable(1, "India");
		CountryComparable australia=new CountryComparable(3, "Australia");
		CountryComparable newzealand=new CountryComparable(2, "New Zealand");
		CountryComparable pakistan=new CountryComparable(4, "Pakistan");
		List<CountryComparable> list=new ArrayList<CountryComparable>();
		list.add(india);
		list.add(australia);
		list.add(newzealand);
		list.add(pakistan);
		
		System.out.println("before sorting:");
		Iterator<CountryComparable> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getCountraName());
		}
		
		Collections.sort(list);
		
		System.out.println("after sorting:");
		Iterator<CountryComparable> itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next().getCountraName());
		}
		
	}
}
