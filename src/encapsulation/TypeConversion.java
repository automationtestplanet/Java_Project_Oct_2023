package encapsulation;

public class TypeConversion {
	
	static void addition(int s1, int s2) {
//		byte s3 = s1+s2;
		byte s3 = (byte)(s1+s2);
	}

	public static void main(String[] args) {
		boolean bool1 = true;    // 1 bit
		byte byte1 = 100;        // 1 byte - 8 bits
		short short1 = 1000;	// 2 bytes - 16 bits
		char char1 = 'A';		// 2 bytes - 16 bits
		int int1 = 10000;		// 4 bytes - 32 bits
		float float1 = 100.59F;  // 4 bytes - 32 bits
		long long1 = 100000;     // 8 bytes - 64 bits
		double double1 = 10000.389538D;  // 8 bytes - 64 bits
		
		
		byte byte2 = 100;      
		short short2 = 10000;
		int int2 = 10000;
		
		
		byte2 = (byte)short2;  // Explicit Conversion
		
		short2 = (short)int2;
		
		byte2 = (byte)int2;
		
		int2 = byte2;   // Implicit Conversion
		int2 = short2;
		
		System.out.println("byte2: "+ byte2);
		System.out.println("short2: "+ short2);
		System.out.println("byte2: "+ byte2);
			
		
		addition(10,20);
		
		String str1 = "10";
		
		System.out.println("str: "+str1);
		
//		byte byte3 = (byte)str1;  //Byte
		
		byte byte3 = Byte.parseByte(str1);
		
//		String str2 = (String)byte2; // String
		String str2 = String.valueOf(byte2);

		
		int a = 100;
		Integer b = 100;
		
		a = b;
		
		b = a;
			
		
		int int3  = Integer.parseInt(str1);
		float foat3  = Float.parseFloat(str1);
		
	}

}
