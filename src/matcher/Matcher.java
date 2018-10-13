package matcher;

import object.Politician;
import object.User;

import java.util.ArrayList;
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
			map = new HashMap<Politician, Integer>();
		}
		
		private int match(User user, Politician politician) {
			int diff = 0;
			//for(String key: user.)
			
			return 0;
			
		}
}
