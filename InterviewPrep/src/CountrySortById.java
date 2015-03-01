import java.util.Comparator;


public class CountrySortById implements Comparator<CountryComparator> {
	
	@Override
	public int compare(CountryComparator c1, CountryComparator c2)
	{
		return (c1.getCountryId()<c2.getCountryId())? -1: (c1.getCountryId()>c2.getCountryId())? 1 : 0; 
	}

}
