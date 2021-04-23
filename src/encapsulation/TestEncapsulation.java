package encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		//Initialize an intern object name test
		Intern example = new Intern();
		
		//Setting values through setter methods
		example.setId("0094");
		example.setName("Tan");
		example.setAge(22);
		example.setSex("Male");
		
		//Getting values through getter methods
		System.out.println("ID: " + example.getId() + "\t" + example.getName() + "\t"
				+ example.getAge() + "years old\t" + example.getSex());
	}
} 
