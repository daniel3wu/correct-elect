package object;

import java.util.HashMap;
import java.util.Random;

public class Politician {
	private String myName;
	private String myId;
	
	private Double nraRating;
	private Double enviroRating;
	
	Random rand = new Random();
	
	private HashMap<String, Double> sigRatings = new HashMap<String, Double>();
	private HashMap<String, Integer> opinions = new HashMap<String, Integer> ();
	
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
		
		double rate = rand.nextDouble();
		//double rate = Rating.getCandidateRating(myId, sigId);
		sigRatings.put("nra", rate);
		return rate;
	}
	
}
