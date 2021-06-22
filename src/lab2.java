
public class lab2 {
	public static void main(String[] args) {
		BARK();
		final1();
		 Primitive();
	}	
	public static void BARK() {
		String dog = "xxx";
		System.out.println("The Dog name = "+dog+" bark"+ "");
	}
	public static void Primitive() {
		float a =(float) 6.9 ;
		int b = (int)a ;
		System.out.println(b);
		
		int c = 37 ;
		float d = c ;
		System.out.println(d);
		
		double e =3.56 ;
		float f = (float)e ;		
		System.out.println(f);
		
		char g = '7' ;
		int h = (int)g;
		System.out.println(h);		
		
	}	
	public static void final1() {
		   final String finalS = "hallo";

		   System.out.println("finalInt value: " + finalS);
		 }



}
