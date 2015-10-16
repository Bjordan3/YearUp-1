
public class Chapter2 {

	public static void main(String[] args) {

		// chars can be incremented
		char ch = 'a';
		for (ch = 'a'; ch != 'z'; ch++) {
			System.out.println("ch is now " + ch);
		}

		// This is a boolean
		boolean b;

		// set boolean to false
		b = false;
		System.out.println("\nb is " + b);

		// set boolean to true
		b = true;
		System.out.println("b is " + b);

		// Testing boolean statement
		if (b)
			System.out.println("This is executed.");

		// testing doesnt work because b is false
		b = false;
		if (b)
			System.out.println("This is not executed");

		// boolean statements work in statements
		System.out.println("10 < 9 is " + (10 < 9));
	}
}
