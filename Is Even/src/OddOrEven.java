import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {

		System.out.println(
				"Eneter a number and I will tell you if it is even or odd. If you are finish type quit:\n");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();

		IsEven(b);

	}
	public static void IsEven(int b) {

		int r = b % 2;
		if (r != 0) {
			System.out.println("This number is odd");
		} else {
			System.out.println("This number is even");
		}
	}
}
