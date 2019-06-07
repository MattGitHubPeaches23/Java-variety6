// Copyright (c) 2019, Matthew Chalifoux.
public class Question
{
	private String text;
	private String answer;

	public Question(){
		text = "";
		answer = "";
	}

	public void setText(String questionText){
		text = questionText;
	}
	
	public void setAnswer(String correctResponse){
		answer = correctResponse;
	}
	
	public boolean checkAnswer(String response){
		return response.equals(answer);
	}
	public void display(){
		System.out.println(text);
	}
	
	public String toString(){
		
		String sub = getClass().getName() + "[text = " + text;
		if(answer != "") {
			sub = sub + " answer = " + answer + "]";
		}
		else {
			sub = sub + "]";
		}
		
		return sub;
	}
}

