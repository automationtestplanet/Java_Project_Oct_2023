package abstraction;

abstract public class AbstractClassEx { //InCompleted class
	int c ;
	
	AbstractClassEx(int c){
		this.c = c;
	}
	
	int addition(int a, int b) {  // Implemented/Concrete/Complete Method
		return a + b;
	}

	abstract protected int substraction(int a, int b); // UnImplemented/non-Concrete/InComplete method
	
	int multiplication(int a, int b) {
		return a * b;
	}

	abstract protected int division(int a, int b);
}
