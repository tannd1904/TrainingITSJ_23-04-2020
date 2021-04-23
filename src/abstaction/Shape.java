package abstaction;

//The abstract class name Shape 
public abstract class Shape {
	String color;
	
	//These are abstract methods
	abstract double area();
	public abstract String show();
	
	//Abstract class can have constructor
	public Shape(String color) {
		this.color = color;
	}
	
	//This is a concrete method
	public String getColor() {
		return color;
	}
}
