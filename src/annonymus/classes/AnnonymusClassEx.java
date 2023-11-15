package annonymus.classes;

public class AnnonymusClassEx {

	public static void main(String[] args) {
		InterfaceEx inf = new InterfaceEx(){
			@Override
			public int addition(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}

			@Override
			public int substarction(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		
		System.out.println(inf.addition(10, 20));
		
		System.out.println(inf.substarction(10, 20));
	}

}
