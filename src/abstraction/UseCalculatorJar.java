package abstraction;

import calculator.Calculator;
import calculator.UseCalculator;


public class UseCalculatorJar {

	public static void main(String[] args) {
		Calculator calc = new UseCalculator();
		
		System.out.println(calc.addition(10, 20));

	}

}
