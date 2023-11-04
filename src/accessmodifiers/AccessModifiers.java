package accessmodifiers;

import otherpackage.Calculator;

public class AccessModifiers {

	public static void main(String[] args) {		
		
		Calculator calc = new Calculator();
		calc.addition(10, 20);
		
//		calc.substraction(10,20);
		
		NewCalculator nCalc = new NewCalculator();
		
		nCalc.addition(10, 20);
//		nCalc.modDivision(10, 2);
		
		
	}

}
