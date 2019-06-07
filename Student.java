// Copyright (c) 2019, Matthew Chalifoux.
public class Student extends Person{
	
	private String major;
	
	
	public Student(String nm, int db, String mj) {
		
		super(nm,db);
		major = mj;
		
	}

	public void display() {
		
		super.display();
		
		System.out.println("major = " + major);
		
	}
	
	public String toString() {
		
		String sub = getClass().getName() + super.toString() +
				"[major = " + major + "]";
		
		return sub;
	}
	
}
