
public class lab12 {

	public static void main(String[] args) {
	String String1 = "You and Me" ; 
	String String2 = " you and me ";

	if(String1==String2) {
		System.out.println("True");
	}
	boolean isFound1 = String1.contains("and");
	boolean isFound2 = String2.contains("and");
	System.out.println("and");
	System.out.println(String1.length());
	System.out.println(String1.substring(4));
	System.out.println(String2.trim());
	System.out.println(String1.toUpperCase());
	System.out.println(String2.trim().toUpperCase());
}
}