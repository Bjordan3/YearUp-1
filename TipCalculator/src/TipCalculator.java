import java.util.Scanner;

public class TipCalculator {
private static Scanner Brandon;
	public static void main(String[] args) {
		
		Brandon = new Scanner(System.in);
		// ask for a bill amount
		System.out.println("What is bill amount?: ");
		// declares the double amount
		double amt;
		// stores the next amount in the amt variable
		amt = Brandon.nextFloat();
		// calls all the methods to have the amt stored from the input into them
		// and be executed
		double tenPercent = TenPercent(amt);
		double fifteenPercent = FifteenPercent(amt);
		double twentyPercent = TwentyPercent(amt);
		
		System.out.println ("Your tips are as follow 10 percent is "+ tenPercent
				+ " 15 percent "+ fifteenPercent + " and 20 percent "+ twentyPercent + ".");
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