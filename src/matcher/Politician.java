package matcher;

import java.util.HashMap;

public class Politician {
	private String myName;
	private String myId;
	
	private Double nraRating;
	private Double enviroRating;
	
	private HashMap<String, Double> sigRatings = new HashMap<String, Double>();
	
	public Politician(String name) {
		myName = name;
		
	}
	
	public String getName() {
		return myName;
	}
	
	private Double getRating(int myId, int sigId) {
		//use api and the getCandidateRating function to return the candidates rating with the NRA
		return 0.0;
	}
}
