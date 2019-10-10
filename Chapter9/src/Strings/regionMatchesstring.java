package Strings;

public class regionMatchesstring {

	public static void main(String args[]) {
		String Str1 = new String("Welcome to Tutorialspoint.com");
		String Str2 = new String("TUTORIALS");

		System.out.print("Return Value :" );
		System.out.println(Str1.regionMatches(true, 11, Str2, 0, 9));
	}
}