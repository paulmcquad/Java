package Strings;

public class indexOfstring4 {

	public static void main(String args[]) {
		String Str = new String("Welcome to Tutorialspoint.com");
		String SubStr1 = new String("Tutorials" );
		System.out.print("Found Index :" );
		System.out.println( Str.indexOf( SubStr1, 15 ));
	}
}