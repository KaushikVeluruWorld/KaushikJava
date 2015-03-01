
public class CountryComparable implements Comparable<CountryComparable> {
	
	
	int countryId;
	String countraName;
	public CountryComparable(int countryId, String countryName) {
		super();
		this.setCountryId(countryId);
		this.setCountraName(countryName);
	}
	
	@Override
	public int compareTo(CountryComparable cc)
	{
		return (this.getCountryId()<cc.getCountryId())? -1 : (this.getCountryId()>cc.getCountryId())? 1 :0;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountraName() {
		return countraName;
	}
	public void setCountraName(String countraName) {
		this.countraName = countraName;
	}
	
	

}
