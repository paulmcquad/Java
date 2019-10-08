package Decision;

public class ifelsestatement {

	public static void main(String[] args) {
		int x = 30;

		if( x < 20 ) {
			System.out.print("This is if statement");
		}else {
			System.out.print("This is else statement");
		}

		// 2: IF ELSE IF

		if( x == 10 ) {
			System.out.print("\nValue of X is 10");
		}else if( x == 20 ) {
			System.out.print("\nValue of X is 20");
		}else if( x == 30 ) {
			System.out.print("\nValue of X is 30");
		}else {
			System.out.print("\nThis is else statement");
		}
	}
}