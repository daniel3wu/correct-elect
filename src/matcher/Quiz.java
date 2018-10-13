package matcher;

import java.util.ArrayList;

public class Quiz {
	int size = 0; 
	ArrayList<Question> questions = new ArrayList<Question>(); 
	
	
	Quiz(int size){
		this.setAnswers(size);
		
		
	}
	
	public void setAnswers(int size) {
		for (int i =0; i < size; i++) {
		//	Question q = new Question();//enter input
		//	questions.add(q);
					
		}
		
		
	}

	public ArrayList<Question> getAnswers (){
		return questions;
	}
	
	
}
