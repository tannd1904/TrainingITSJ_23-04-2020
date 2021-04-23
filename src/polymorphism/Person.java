package polymorphism;

//The Person class has attributes and methods 
public class Person {
	protected String name;
	protected int age;
	protected String sex;

	public Person() {
	}
	
	public Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void show () {
		System.out.println("I am a person!");
	}
	
}
