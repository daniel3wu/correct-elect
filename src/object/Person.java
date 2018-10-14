package object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Person {
	protected String myName;
	protected int myId;
	
	protected int gunRating;
	protected int lgbtqRating;
	protected int enviroRating;
	protected int abortionRating;
	protected int healthcareRating;
	
	public enum Party {DEMOCRAT, REPUBLICAN, LIBRETARIAN, GREEN}
	protected static final ArrayList<Party> parties = new ArrayList<Party> (Arrays.asList(Party.values()));
	
	public enum Office {SENATOR, REPRESENTATIVE, PRESIDENT, GOVERNOR, MAYOR}
	protected static final ArrayList<Office> offices = new ArrayList<Office> (Arrays.asList(Office.values()));

	protected int myZip;
	
	String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
	
	protected HashMap<String, Integer> opinions = new HashMap<String, Integer> ();
	
	public String getName() {
		return myName;
	}
	
	public int getZip() {
		return myZip;
	}
	
	public int getGunRating() {
		return gunRating;
	}
	public int getLgbtqRating() {
		return lgbtqRating;
	}
	public int getEnviroRating() {
		return enviroRating;
	}
	public int getAbortionRating() {
		return abortionRating;
	}
	public int getHealthcareRating() {
		return healthcareRating;
	}
	
	public int getRating(String s) {
		return opinions.get(s);
	}
	
	public Set<String> getKeys() {
		return opinions.keySet();
	}
	
	public int getId() {
		return myId;
	}
}
