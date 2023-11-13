package accessmodifiers;

import abstraction.InterfaceEx;
import otherpackage.Calculator;
import static abstraction.InterfaceEx.*;

class NewCalculator extends Calculator {

	private void modDivision(final int a, int b) {
//		final int c = 100;
		System.out.println("Modular Division: " + a % b);
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
//		calc.substraction(10, 5);
		
		NewCalculator nCalc = new NewCalculator();
		
		nCalc.addition(10, 20);
		
		nCalc.substraction(10, 5);
		nCalc.modDivision(10, 3);
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
