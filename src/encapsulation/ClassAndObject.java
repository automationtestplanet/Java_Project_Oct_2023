package encapsulation;

public class ClassAndObject {
	
	boolean bool1;
	byte byte1;
	short short1;
	char char1;
	int int1;
	long long1;
	static float float1;
	static double double1;
	String string1;
	ClassAndObject clsObj2;
	
	public ClassAndObject(){
		
	}
	
	public ClassAndObject(boolean bool1, int byte1, int short1, char char1, int int1, long long1, float float1, double double1, String string1){
		this.bool1 = bool1;
		this.byte1 = (byte)byte1;
		this.short1 = (short)short1;
		this.char1 = char1;
		this.int1 = int1;
		this.long1 = long1;
		ClassAndObject.float1 = float1;
		ClassAndObject.double1 = double1;
		this.string1 = string1;
	}
	
	void accessInstanceData() {		
		int int1;
		long long1;
	}
	
	void assignData() {
		this.accessInstanceData();
	}
	
//	static void accessInstanceData2() {
//		
//		this.bool1 = true;
//		this.byte1 = 10;
//		this.short1 = 100;
//		this.char1 = 'A';
//		this.int1 = 1000;
//		this.long1 = 10000;
//		this.float1 = 100.5F;
//		this.double1 = 1000.7D;
//		this.string1 = "Hello";
////		this.clsObj2 = new ClassAndObject();
//	}

	public static void main(String[] args) {
		
		float float1;
		double double1;
		ClassAndObject clsObj2;
		  
//		System.out.println(float1);
//		System.out.println(double1);
	
		
//		ClassAndObject clsObj = new ClassAndObject(true, 10, 100, 'A',1000, 10000, 100.5F, 1000.7D, "Hello");
		ClassAndObject clsObj = new ClassAndObject();
		ClassAndObject clsObj3 = new ClassAndObject(true, 10, 100, 'A',1000, 10000, 100.5F, 1000.7D, "Hello");
		System.out.println(ClassAndObject.float1);
		System.out.println(ClassAndObject.double1);
		
		System.out.println(clsObj.bool1);
		System.out.println(clsObj.byte1);
		System.out.println(clsObj.short1);
		System.out.println(clsObj.char1);
		System.out.println(clsObj.int1);
		System.out.println(clsObj.long1);
		System.out.println(clsObj.string1);
		System.out.println(clsObj.clsObj2);
		System.out.println("-----------------------------------------------------");
//		clsObj.accessInstanceData();
		
		System.out.println(clsObj.bool1);
		System.out.println(clsObj.byte1);
		System.out.println(clsObj.short1);
		System.out.println(clsObj.char1);
		System.out.println(clsObj.int1);
		System.out.println(clsObj.long1);
		System.out.println(clsObj.string1);
		System.out.println(clsObj.clsObj2);
		

	}

}
