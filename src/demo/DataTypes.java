package demo;

public class DataTypes {

	public static void main(String[] args) {

		byte byte1 = 100;  //datatype + varaible + data  -> declare and initialize
		
		byte byte2;      // declaration
		
		byte2 = -127;    // initialization		
		
		short short1 = -32768;
		
		short short2 = 32767;
		
		int int1 = -2147483648;
		
		long long1 = 92363235703953705L;
		
		float float1 = 10.1234E34F;
		double double1 = 10.1234E90D;
		
		char ch = 'A';
		
		char ch2 = '1';
		
		char ch3 = '!';		
		
		String str = "ABCDEF1234*&#*";		
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		byte byte3 = (byte)(byte1+byte2); // -28
		
		short short3 = (short)(short1 + short2);  // -1
		
		byte byte4 = 100-128; // -28
		short short4 = -32768 + 32767;  // -1

		System.out.println(byte1+byte2);
		System.out.println(short1 + short2);
	}

}
