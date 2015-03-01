import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class ComparatorMain {

	public static void main(String... args)
	{
		CountryComparator india=new CountryComparator(1, "India");
		CountryComparator pakistan=new CountryComparator(4, "Pakistan");
		CountryComparator srilanka=new CountryComparator(2, "Srilanka");
		CountryComparator maldives=new CountryComparator(3, "Maldives");
		
		List<CountryComparator> list=new ArrayList<CountryComparator>();
		list.add(india);
		list.add(pakistan);
		list.add(srilanka);
		list.add(maldives);
		
	
		System.out.println("before sorting by Id:");
		Iterator<CountryComparator> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().getCountryName());
		}
		

		Collections.sort(list,new CountrySortById());
		
		System.out.println("after sorting by Id:");
		Iterator<CountryComparator> itr1=list.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next().getCountryName());
		}

		
		//sorting by name
		Collections.sort(list, new Comparator<CountryComparator>() {
			@Override
			public int compare(CountryComparator c1,CountryComparator c2)
			{
				return (c1.getCountryName().compareTo(c2.getCountryName()));
			}
		});
		
		System.out.println("after sorting by Name:");
		Iterator<CountryComparator> itr2=list.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next().getCountryName());
		}
		
	}
}
