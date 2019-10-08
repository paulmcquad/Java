package LocalVar;

public class localvar {

	public void pupAge() {
		int age = 0;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}


	public static void main(String[] args) {
		localvar test = new localvar();
		test.pupAge();
	}

}
