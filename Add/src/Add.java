
public class Add {
	public static void main(String args[]){
		// calls the methods of Add with parameters and Add without parameters
				// and displays them
				Add1();
				Add1(10, 20);
				Add2(10, 5, 2, 3);
				// states a data type to store the values of the areas from the circle
				// and rectangle methods
				double AreaInMainMethodC = CalculateCircleArea(5);
				double AreaInMaindMethodR = CalculateRectangleArea(1, 2);
				// prints the stored values of the areas of the circle and rectangle
				System.out.println("The area of the circle is " + AreaInMainMethodC
						+ ", and the area of the rectangle is " + AreaInMaindMethodR
						+ ".");	
		
	}
	public static void Add1() {
		int a = 3;
		int b = 5;
		int sum = (a + b);
		System.out
				.println("The numbers were 3 and 5. When they are add they are "
						+ sum + ".");
	}
	public static void Add1(int c, int d) {
		int sum2 = c + d;
		System.out.println(
				"The sum is of " + c + " and " + d + " is " + sum2 + ".");
	}
	public static void Add2(int a, int b, int c, int d){
		double total = a + b / c * d;
		float divide = b / c;
		double multiply = 2.5 * a;
		System.out.println(total + " " + divide + " " + multiply);
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
}
