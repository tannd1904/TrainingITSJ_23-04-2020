package abstaction;

public class TestAbstaction {
	public static void main(String[] args) {
		//Initialize new objects
		Shape shape1 = new Circle("Red", 2.2);
		Shape shape2 = new Rectangle("Blue", 2, 4);
		
		//Call the show() methods to see difference
		System.out.println(shape1.show());
		System.out.println(shape2.show());
	}
}
