package polymorphism;

//The Student class inherits from the Person class
public class Student extends Person{
	public String idStudent;

	public Student(String name, int age, String sex, String idStudent) {
		super(name, age, sex);
		this.idStudent = idStudent;
	}

	public Student() {
		super();
	}

	public String getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}
	
	//This method overrides show() of Person
	@Override
	public void show() {
		System.out.println("I am a Student with id " + this.idStudent);
	}
}
