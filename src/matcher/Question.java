package matcher;

public class Question {

	
	int answer = 0;
	
	Question(String input){
		
		if (input.equals("Yes"))
			answer = 1;
		
		else if (input.equals("No"))
			answer = -1;
		
		else {
			answer = 0;
		}
		
	
	
	}
	
	public int getAnswer() {
		return answer;
	}
	
	
	

}
