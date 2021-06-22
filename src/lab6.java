
public class lab6 {

	public static void main(String[] args) {
	
		lab61();
		lab62();
		lab63();
		lab64();
	}
	
	public static void lab61() {
	   int i = 1;
	   while (i <= 10) {
	     System.out.println( i);
	     i++;
	   }
}
	public static void lab62() {
		   int i = 1;
		   int sum =0;
		   while (i <= 10) {
		     sum+=i;
		     i++;
		   }
		     System.out.println( sum);
	}
	public static void lab63() {
		   int i = 1;
		   while (i <= 100) {
			   if(i % 12 == 0)
				   System.out.println(i); 
		     i++;
		   }
		     
	}
	
	public static void lab64() {
		int myArray[] = {1,2,3,4,5};
		   for(int counter : myArray) {
		     System.out.println("Counter : " + counter);
		   }   
	}
	
	
	}
