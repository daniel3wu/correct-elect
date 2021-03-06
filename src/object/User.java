package object;

import java.util.HashMap;
import java.util.Map;

public class User extends Person {
	
	private String myStreetAddress;
	private String myCity;
	
	public User(String name, Map<String, Integer> answerMap) {
		myName = name;
		
		for (String issue : answerMap.keySet()) {
			assignRating(issue, answerMap.get(issue));
		}
	}
	
	public void assignRating(String s, int rating) {
		opinions.put(s, rating);
		switch (s){
			case("gun"): gunRating = rating;
			case ("healthcare"): healthcareRating = rating;
			case ("lgbtq"): lgbtqRating = rating;
			case ("environment"): enviroRating = rating;
			case ("abortion"): abortionRating = rating;
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if (! (o instanceof User) || o == null){
			return false;
		}
		User ob = (User) o;
		if (ob.getId() == myId) {
			return true;
		}
		return false;
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
