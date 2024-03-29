import java.io.IOException;
import java.util.Scanner;
public class Name {
	private static Scanner s;
	public static void main(String args[]) throws IOException {

		System.out.println("Hello and welcome, Please follow the directions.");
		s = new Scanner(System.in);
		// declares a data type string and leaves its value empty
		String name = "";
		// declares a data type int and makes it zero
		int age = 0;
		// declares a data type double and makes it zero
		double userHeight = 0;
		// Prints saves the input of name in a string and the height and age in
		// an int variable
		System.out.println("What is your name?: ");
		name = s.nextLine();
		System.out.println("What is your age?: ");
		age = s.nextInt();
		System.out.println("What is your height in inches?: ");
		userHeight = s.nextDouble();
		// prints all the stored values
		System.out.println("Hello " + name + ". You have told me your age is"
				+ age + " your height is " + userHeight
				+ "inches tall. Nice to meet you, my name is Cortona.");
		// calls the methods of Add with parameters and Add without parameters
		// and displays them
		Add();
		Add(47, 2230);
		// states a data type to store the values of the areas from the circle
		// and rectangle methods
		double AreaInMainMethodC = CalculateCircleArea(5);
		double AreaInMaindMethodR = CalculateRectangleArea(1, 2);
		// prints the stored values of the areas of the circle and rectangle
		System.out.println("The area of the circle is " + AreaInMainMethodC
				+ ", and the area of the rectangle is " + AreaInMaindMethodR
				+ ".");
		// ask for a bill amount
		System.out.println("What is bill amount?: ");
		// declares the double amount
		double amt;
		// stores the next amount in the amt variable
		amt = s.nextFloat();
		// calls all the methods to have the amt stored from the input into them
		// and be executed
		double tenPercent = TenPercent(amt);
		double fifteenPercent = FifteenPercent(amt);
		double twentyPercent = TwentyPercent(amt);
		// Prints out the bill amounts with the 10 15 and 20 percent amounts
		// added on
		System.out.format("Your tips are as follow 10 percent is "+ tenPercent
				+ " 15 percent "+ fifteenPercent + " and 20 percent "+ twentyPercent + ".");

	}
	public static void Add() {
		int a = 3;
		int b = 5;
		int sum = (a + b);
		System.out
				.println("The numbers were 3 and 5. When they are add they are "
						+ sum + ".");
	}
	public static void Add(int c, int d) {
		int sum2 = c + d;
		System.out.println(
				"The sum is of " + c + " and " + d + " is " + sum2 + ".");
	}
	public static void String(String args[]) {
		int e = 10;
		float f = 12;
		String str = "This should print " + e + " , " + f
				+ ", and this string is done! ";

		System.out.println(str);

	}
	public static double CalculateCircleArea(int radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
	public static double CalculateRectangleArea(int length, int width) {
		double area = length * width;
		return area;

	}
	public static double TenPercent(double amt) {

		double TenPercent = ((amt * .1) + amt);
		return TenPercent;
	}
	public static double FifteenPercent(double amt) {

		double fifteenPercent = ((amt * .15) + amt);
		return fifteenPercent;
	}
	public static double TwentyPercent(double amt) {

		double TwentyPercent = ((amt * .20) + amt);
		return TwentyPercent;
	}

}
