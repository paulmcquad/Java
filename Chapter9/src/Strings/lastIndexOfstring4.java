package Strings;

public class lastIndexOfstring4 {

	public static void main(String args[]) {
		String Str = new String("Welcome to Tutorialspoint.com");
		String SubStr1 = new String("Tutorials" );
		System.out.print("Found Last Index :" );
		System.out.println( Str.lastIndexOf( SubStr1, 15 ));
	}
}