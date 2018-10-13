package object;

import java.util.HashMap;

public class Politician {
	private String myName;
	private String myId;
	
	private Double nraRating;
	private Double enviroRating;
	
	private HashMap<String, Double> sigRatings = new HashMap<String, Double>();
	private HashMap<String, int> opinions = new HashMap<String, int> ();
	
	public Politician(String name) {
		myName = name;
		
		int nraId = 0; //TODO: load in NRA ids
		nraRating = getRating(nraId, "nra");
		
		
	}
	
	public String getName() {
		return myName;
	}
	
	private double getRating(int sigId, String sigName) {
		//use api and the getCandidateRating function to return the candidates rating with the sig
		
		double rate = 0.0;
		//double rate = Rating.getCandidateRating(myId, sigId);
		sigRatings.put("nra", rate);
		return rate;
	}
	
}
