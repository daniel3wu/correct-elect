package object;

import java.util.HashMap;

public class Politician {
<<<<<<< HEAD:src/object/Politician.java

=======
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
>>>>>>> fdd2824435a5272a9d2a5af1d6a9144acb9b4c2e:src/matcher/Politician.java
}
