import java.io.IOException;
import java.util.Scanner;

public class Name {

	public static void main(String args[]) throws IOException {

		System.out.println("Hello and welcome, Please follow the directions.");
		Scanner s = new Scanner(System.in);
		String name = "";
		String yn = "";
		int age = 0;
		double userHeight = 0;

		System.out.println("What is your name?: ");
		name = s.nextLine();
		System.out.println("What is your age?: ");
		age = s.nextInt();
		System.out.println("What is your height in inches?: ");
		userHeight = s.nextDouble();
		System.out.println("Hello " + name + ". You have told me your age is "
				+ age + " your height is " + userHeight
				+ "inches tall. Nice to meet you, my name is Cortona.");

		Add();
		Add(38, 27);
		double AreaInMainMethodC = CalculateCircleArea(12);
		double AreaInMaindMethodR = CalculateRectangleArea(7, 8);
		System.out.println("The area of the circle is " + AreaInMainMethodC + ", and the area of the rectangle is " + AreaInMaindMethodR + ".");
		
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
	
	public static double CalculateCircleArea(int radius){
		double area = 3.14*radius*radius;
		return area;
	}
	public static double CalculateRectangleArea(int length, int width){
		double area = length * width;
		return area;
		
	}

}
