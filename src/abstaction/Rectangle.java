package abstaction;

public class Rectangle extends Shape {
	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	//Redefining the abstract methods using Overring keyword
	@Override
	double area() {
		return length * width;
	}
	
	@Override
	public String show() {
		return "Rectangle color is: " + super.getColor() + "and area is: " + area();
	}
}
