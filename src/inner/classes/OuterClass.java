package inner.classes;

public class OuterClass {

	class InnerInstanceClass {

		void innerInstanceClassMethod1() {
			System.out.println("THis is Inner Instance Class method1");
		}
	}

	static class InnerStaticClass {
		void innerStaticClassMethod2() {
			System.out.println("THis is Inner Static Class method2");
		}
	}

	static {  //static block
		System.out.println("This is Static Unnamed class");
	}

	{ // Annonimus Class
		System.out.println("This is Instance Unnamed class");
	}
	
	public static void main(String[] args) {
		OuterClass outerls = new OuterClass();
		
		OuterClass.InnerInstanceClass innerInstanceCls  = outerls.new InnerInstanceClass();
		
		innerInstanceCls.innerInstanceClassMethod1();
		
		OuterClass.InnerStaticClass innerStaticCLs = new InnerStaticClass();
		
		innerStaticCLs.innerStaticClassMethod2();
		
	}

}
