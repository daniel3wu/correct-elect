package object;

import java.util.HashMap;
import java.util.Random;

public class Politician extends Person{
	
	//private Double nraRating;

	private Party myParty;
	private Office myOffice;
	
	Random rand = new Random();
	
	private HashMap<String, Double> sigRatings = new HashMap<String, Double>();
	
	public Politician(String name) {
		myName = name;
		
//		int nraId = 0;
//		nraRating = getSigRating(nraId, "nra");
		
		initializeRatings();
		myParty = parties.get(rand.nextInt(parties.size()));
		myOffice = offices.get(rand.nextInt(parties.size()));
		myZip = rand.nextInt(89999)+10000;
	}
		
	public Office getOffice() {
		return myOffice;
	}
	
	public Party getParty() {
		return myParty;
	}
		
	private void initializeRatings() {
		gunRating = rand.nextInt(3);
		lgbtqRating = rand.nextInt(3);
		enviroRating = rand.nextInt(3);
		abortionRating = rand.nextInt(3);
		healthcareRating = rand.nextInt(3);
		opinions.put("gun", gunRating);
		opinions.put("lgbtq", lgbtqRating);
		opinions.put("environment", enviroRating);
		opinions.put("abortion", abortionRating);
		opinions.put("healthcare", healthcareRating);
	}
	 
	private double getSigRating(int sigId, String sigName) {
		//use api and the getCandidateRating function to return the candidates rating with the sig
		
		double rate = rand.nextInt(3);
		//double rate = Rating.getCandidateRating(myId, sigId);
		sigRatings.put(sigName, rate);
		return rate;
	}
	
}
