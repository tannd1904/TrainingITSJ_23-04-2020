package inheritance;

public class TestInheritance {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//Initialize a CalculationLv2 object name example
		CalculationLv2 example = new CalculationLv2();
		//We can use methods of CalculationLv1
		example.addition(a, b);
		example.subtraction(a, b);
		example.multiplication(a, b);
		example.division(a, b);
	}
}
