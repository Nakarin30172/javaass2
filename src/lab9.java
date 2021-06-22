
public class lab9 {

public static void main(String[] args) {
		
		lab91();
		lab92();
		lab93();

	}
	
	
	
	public static void lab91() {
		   int count = 0;	
		   for(int i = 0; i<=20; i++)
			   count++;
		   }
	public static void lab92() {
		   int count = 0;	
		   for(int i = 0; i<=20; i++) {
			   count++;
			if(count==11) 
				continue;
		   }
	}
	public static void lab93() {
		   int count = 0;	
		   for(int i = 0; i<20; i++) {
			   count++;
			if(count==11) 
				 System.out.println(count);
			continue;
		   }
	}
}
