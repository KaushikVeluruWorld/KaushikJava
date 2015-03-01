
public class CountryComparator {

	int countryId;
	String countryName;
	
	public CountryComparator(int countryId, String countryName) {
		super();
		this.setCountryId(countryId);
		this.setCountryName(countryName);
		
	}
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
}
