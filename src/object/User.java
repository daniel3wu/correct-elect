package object;

public class User extends Person {
	
	private String myStreetAddress;
	private String myCity;
	
	public void assignRating(String s, int rating) {
		opinions.put(s, rating);
		switch (s){
			case("gun"): gunRating = rating;
			case ("healthcare"): healthcareRating = rating;
			case ("lgbtq"): lgbtqRating = rating;
			case ("enviro"): enviroRating = rating;
			case ("abortion"): abortionRating = rating;
		}
	}
	
	public void assignStreetAddress(String addy) {
		myStreetAddress = addy;
	}
	
	public void assignCity(String city) {
		myCity = city;
	}
	
	public String getStreetAddress() {
		return myStreetAddress;
	}
	
	public String getCity() {
		return myCity;
	}

}
