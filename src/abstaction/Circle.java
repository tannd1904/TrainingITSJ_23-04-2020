package abstaction;

public class Circle extends Shape{
	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	//Redefining the abstract methods using Overring keyword
	@Override
	double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	@Override
	public String show() {
		return "Circle color is " + super.getColor() + "and area is " + area();
	}
}
