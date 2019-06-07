// Copyright (c) 2019, Matthew Chalifoux.
import java.util.Scanner;

public class NumericQuestion extends Question {

	private double answer;
	
	public NumericQuestion() {
		super();
		answer = 0;
	}
	
	
	public void setAnswer(String ans) {
		
		double sub = Double.parseDouble(ans);
		answer = sub;
		
	}
	
	
	public boolean checkAnswer(String response){
		
		Double here = Double.parseDouble(response);
				
		
		
		return Math.abs(here-answer) <= 0.01;
	}	
	
	public String toString() {
		
		String sub = "";
		
		sub = super.toString() + "[answer = " +
		answer + "]";
		
		return sub;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		NumericQuestion test = new NumericQuestion();
		
		test.setText("5.45 + 3.23");
		test.setAnswer("8.68");
				
		test.display();
		
		System.out.print("Your answer: ");
		String response = in.nextLine();
		System.out.println(test.checkAnswer(response));
		
	}
	
}
