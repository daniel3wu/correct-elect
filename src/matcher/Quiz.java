package matcher;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz {
	int size = 0; 
	HashMap<String,Question> questions = new HashMap<String, Question>(); 
	
	
	String[] opinions = {"LGBTQ", "Gun", "Global Warming", "Abortion", "Health Care"};
	Quiz(int size){
		this.setAnswers(opinions.length);
		
		
	}
	
	public void setAnswers(int size) {
		for (int i =0; i < size; i++) {
		//	Question q = new Question();//enter input
			
		//questions.put(opinions[i], q);
					
		}
		
		
	}

	public HashMap<String, Question> getAnswers (){
		return questions;
	}
	
	
}
