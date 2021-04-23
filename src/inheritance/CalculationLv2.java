package inheritance;

//The CalculationLv2 inherits attribute z and the methods addition and subtraction 
//of CalculationLv1 throughout the extends keyword
public class CalculationLv2 extends CalculationLv1{
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers: " + z);
	}
	
	public void division(int x, int y) {
		if (y == 0) {
			System.out.println("Math Error!");
		} else {
			z = x / y;
			System.out.println("The quotient of the given numbers: " + z);
		}
	}
}