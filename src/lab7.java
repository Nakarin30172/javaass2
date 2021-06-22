import java.util.Scanner; 

public class lab7 {

	public static void main(String[] args) {
		
		lab71();
		lab72();

	}
	
	
	
	public static void lab71() {
		   int i = 20;		   
			     System.out.println( i);
}
	
	public static void lab72() {
		int a;
		do {
		   Scanner input = new Scanner(System.in);		   
		   int num = input.nextInt();
		   a = num;
		}while(a % 2 == 0);
		   
}
}