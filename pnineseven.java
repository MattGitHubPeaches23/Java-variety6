// Copyright (c) 2019, Matthew Chalifoux.
public class pnineseven {

	public static void main(String[] args) {
		
		Question test = new Question();
		
		test.setText("How many times can you do a different version of the same"
				+ " CS assignment?");
		test.setAnswer("Infinite times");
		
		NumericQuestion test2 = new NumericQuestion();
		
		test2.setText("5.45 + 3.23");
		test2.setAnswer("8.68");
				
		
		System.out.println(test.toString());
		System.out.println(test2.toString());
	}
	
}


//Question[text = How many times can you do a different version of the same CS assignment? answer = Infinite times]
//NumericQuestion[text = 5.45 + 3.23][answer = 8.68]
