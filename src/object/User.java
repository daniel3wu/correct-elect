package object;

public class User extends Person {
	
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
	
	

}
