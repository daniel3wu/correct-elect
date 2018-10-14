package matcher;

public class Question {

	private String text;
	private String name;
	private String answer;

	
	
	public Question(String textStarter, String name){
		text = textStarter;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getText() {
		return this.text;
	}
	
//	Question(String input){
//		
//		if (input.equals("Yes"))
//			answer = 1;
//		
//		else if (input.equals("No"))
//			answer = -1;
//		
//		else {
//			answer = 0;
//		}
	//}
	
	
		
	

	
	
	public String getAnswer() {
		return answer;
	}
	
	
	

}
