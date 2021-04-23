package inheritance;

//The CalculationLv1 class has 1 attribute and 2 methods are addition and subtraction
public class CalculationLv1 {
	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers: " + z);
	}
	
	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers: " + z);
	}
}