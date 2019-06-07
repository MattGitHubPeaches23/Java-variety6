// Copyright (c) 2019, Matthew Chalifoux.
public abstract class Person {

	private String name;
	private int birthYear;
	
	public Person(String nm, int by) {
		name = nm;
		birthYear = by;
	}
	
	public void display() {
		
		System.out.println("name = " + name);
		System.out.println("birthYear = " + birthYear);
		
	}
	
	public String toString() {
		
		String sub = "[name = " + name +
				" birthYear = " + birthYear + "]";
		
		return sub;
		
	}
	
}
