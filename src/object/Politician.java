package object;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Politician {
	private String myName;
	private String myId;
	
	
	private Double nraRating;
	private int gunRating;
	private int lgbtqRating;
	private int enviroRating;
	private int abortionRating;
	private int healthcareRating;
	
	public enum Party {DEMOCRAT, REPUBLICAN}
	private static final ArrayList<Party> parties = new ArrayList<Party> (Arrays.asList(Party.values()));
	
	public enum Office {SENATOR, REPRESENTATIVE, PRESIDENT, GOVERNOR, MAYOR}
	private static final ArrayList<Office> offices = new ArrayList<Office> (Arrays.asList(Office.values()));
	
	private Party myParty;
	private Office myOffice;
	private int myZip;
	
	Random rand = new Random();
	
	String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
	
	private HashMap<String, Double> sigRatings = new HashMap<String, Double>();
	private HashMap<String, Integer> opinions = new HashMap<String, Integer> ();
	
	public Politician(String name) {
		myName = name;
		
//		int nraId = 0;
//		nraRating = getSigRating(nraId, "nra");
		
		initializeRatings();
		myParty = parties.get(rand.nextInt(parties.size()));
		myOffice = offices.get(rand.nextInt(parties.size()));
		myZip = rand.nextInt(89999)+10000;
	}
	
	public String getName() {
		return myName;
	}
	
	private void initializeRatings() {
		gunRating = rand.nextInt(3);
		lgbtqRating = rand.nextInt(3);
		enviroRating = rand.nextInt(3);
		abortionRating = rand.nextInt(3);
		healthcareRating = rand.nextInt(3);
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
	
	private double getSigRating(int sigId, String sigName) {
		//use api and the getCandidateRating function to return the candidates rating with the sig
		
		double rate = rand.nextInt(3);
		//double rate = Rating.getCandidateRating(myId, sigId);
		sigRatings.put(sigName, rate);
		return rate;
	}
	
}
