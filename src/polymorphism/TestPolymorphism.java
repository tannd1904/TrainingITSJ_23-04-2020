package polymorphism;

public class TestPolymorphism {
	public static void main(String[] args) {
		//Initialize a new Person object 
		Person example = new Person("Tan", 22, "Male");
		//Cal the show() method 
		example.show();
		
		//Now example is a Student
		example = new Student(example.getName(), example.getAge(), example.getSex(), "N17DCCN150");
		//Show again to see the difference
		example.show();
		
	}
}
