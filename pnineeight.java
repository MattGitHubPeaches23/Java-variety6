// Copyright (c) 2019, Matthew Chalifoux.
public class pnineeight {
	
	public static void main(String [] args) {
		
		
		Student test = new Student("Matt ", 1990, "Computer Science");
		
		Instructor test2 = new Instructor("Jamal", 1980, 150000);
		
		
		
		
		test.display();
		test2.display();
		
		System.out.println(test.toString());
		System.out.println(test2.toString());
		
		
	}

}

//name = Matt 
//birthYear = 1990
//major = Computer Science
//name = Jamal
//birthYear = 1980
//salary = 150000.0
//Student[name = Matt  birthYear = 1990][major = Computer Science]
//Instructor[name = Jamal birthYear = 1980][salary = 150000.0]
