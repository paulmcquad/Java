package Strings;

public class splitstring {

	public static void main(String args[]) {
		String Str = new String("Welcome-to-Tutorialspoint.com");
		System.out.println("Return Value :" );      

		for (String retval: Str.split("-")) {
			System.out.println(retval);
		}
	}
}