// Copyright (c) 2019, Matthew Chalifoux.
public class Instructor extends Person{

	private double salary;
	
	public Instructor(String nm, int db, double sal){
		
		super(nm,db);
		salary = sal;
		
	}
	
	public void display() {
		
		super.display();
		System.out.println("salary = " + salary);
		
	}
	
	public String toString() {
		
		String sub;
		
		sub = getClass().getName() + super.toString() + 
				"[salary = " + salary + "]";
		return sub;
		
	}
	
}
