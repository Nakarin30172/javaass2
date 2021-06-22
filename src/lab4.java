
public class lab4 {

	public static void main(String[] args) {
		
		lab11();
		lab12();
	}
		public static void lab11() {
			
			int i  =   69  ;
			
			
			if (i >= 80)
			     System.out.println("good");
			if ((i < 80) && (i >= 50))
				     System.out.println("normal");
			if (i < 50)
			     System.out.println("fail");

		}
		
		public static void lab12() {
			
			int     j  = 69     ;
			boolean n  = true   ;
			
			
				if (n == true)
					System.out.println("good");				
				if ((j >= 80) && (n == false))
					System.out.println("good");
				if ((j < 80) && (j >= 50) && (n == false))
					System.out.println("normal");
				if ((j < 50) && (n == false))
					System.out.println("fail");

		}
	
}