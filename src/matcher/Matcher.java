package matcher;

import object.Politician;
import object.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Matcher {

	
		private User myUser;
		private List<Politician> myPoliticians;
		private Map<Politician, Integer> map;
		
		
		/**
		 * Constructor for matcher class
		 * @param person the user to find preference for
		 * @param politicians arraylist of all politicians
		 */
		public Matcher(User person, List<Politician> politicians) {
			myUser = person;
			myPoliticians = new ArrayList<Politician>(politicians);
			map = matchAll();
		}
		
		/**
		 * Calculates the % agreement of opinions between the politician passed and myUser by 
		 * calculating the mean difference of opinion in each topic
		 * @param politician 
		 * @return
		 */
		private int match(Politician politician) {
			int diff = 0;
			for(String key: myUser.getKeys()) {
				diff += Math.pow((myUser.getRating(key) - politician.getRating(key)), 2);
			}
			diff = diff/myUser.getKeys().size();
			
			return (int) ((4 - diff)/0.04);
			
		}
		
		/**
		 * Calculates the % agreement for all politicans and returns a corresponding hashmap
		 * @return returns a map in the form <Politician, % agreement>
		 */
		private Map<Politician, Integer> matchAll(){
			Map<Politician, Integer> map = new HashMap<Politician, Integer>();
			for(Politician pol: myPoliticians) {
				map.put(pol, match(pol));
			}
			return map;
		}
		
		
		/**
		 * Returns the best matching politician
		 * @return closest match
		 */
		public Politician getBestMatch() {
			int max = Collections.max(map.values());
			for(Politician key: map.keySet()) {
				if(map.get(key) == max) return key;
			}
			return null;
		}
		
		public int agreement(Politician pol) {
			return map.get(pol);
		}
		
		
}
