package models;

public abstract class Person{	
	
	//Attributes
	protected String name;
	
	//Constructors
	//Empty Constructor
	public Person(){
		this.name = "Matata";
	}
	
	//Constructor with arguments	
	public Person(String name){		
		this.name = name;
	}
	
	//Getters and Setters
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;			
	}
	
	@Override
	public String toString(){
		return "Name: "+ name ;
		
	}
	
}