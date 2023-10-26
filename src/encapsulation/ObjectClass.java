package encapsulation;

public class ObjectClass {

	public static void main(String[] args) {
		
		boolean bool1 = true;
		byte byte1 = 100;
		short short1 = 1000;
		char char1 = 'A';
		int int1 = 10000;
		float float1 = 100.5F;
		long long1 = 100000L;
		double double1 = 1000.75D;		
		String str1 = "Hello";
		
		Object obj;
		
		Object bool2 = true;
		Object byte2 = 100;
		Object short2 = 1000;
		Object char2 = 'A';
		Object int2 = 10000;
		Object float2 = 100.5F;
		Object long2 = 100000L;
		Object double2 = 1000.75D;		
		Object str2 = "Hello";		
		Object objectClass = new ObjectClass();
		
		boolean bool3 = (boolean)bool2;
		byte byte3 = (byte)(int)byte2;
		short short3 = (short)(int)short2;
		char char3 = (char)char2;
		int int3 = (int)int2;
		float float3 = (float)float2;
		long long3 = (long)long2;
		double double3 = (double)double2;		
		String str3 = (String)str2;
		ObjectClass objectClass2 = (ObjectClass)objectClass;
		
		System.out.println(bool3);
		System.out.println(byte3);
		System.out.println(short3);
		System.out.println(char3);
		System.out.println(int3);
		System.out.println(float3);
		System.out.println(long3);
		System.out.println(double3);
		System.out.println(str3);
		
		var bool4 = true;
		var byte4 = 100;
		var short4 = 1000;
		var char4 = 'A';
		var int4 = 10000;
		var float4 = 100.5F;
		var long4 = 100000L;
		var double4 = 1000.75D;		
		var str4 = "Hello";
		
		boolean bool5 = bool4;
		byte byte5 = (byte)byte4;
		short short5 = (short)short4;
		char char5 = char4;
		int int5 = int4;
		float float5 = float4;
		long long5 = long4;
		double double5 = double4;		
		String str5 = str4;
		
		System.out.println(bool5);
		System.out.println(byte5);
		System.out.println(short5);
		System.out.println(char5);
		System.out.println(int5);
		System.out.println(float5);
		System.out.println(long5);
		System.out.println(double5);
		System.out.println(str5);
		
	}

}
