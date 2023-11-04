package inheritance;

public class UseCalculator {

	public static void main(String[] args) {
		
		NewCalculator calc= new NewCalculator();
		
		calc.addition(10, 20);
		
		calc.substraction(10, 20);
		
		calc.multiplication(10, 20);
		
		calc.division(10, 20);
		
		calc.modDivision(10, 20);
	}

}
