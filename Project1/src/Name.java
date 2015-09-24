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
		System.out.println("Hello " + name + ". You have told me your age is " + age + " your height is " + userHeight
				+ "inches tall. Nice to meet you, my name is Cortona.");
		
		Add();
		Add(10,20);
	}
	public static void Add(){
		int a = 3;
		int b = 5;
		int sum = (a + b);
		System.out.println("The numbers were 3 and 5. When they are add they are " + sum + ".");
	}
	
	public static void Add(int c, int d){
		int sum2 = c + d;
		System.out.println( "The sum is of " + c + " and " + d + " is " + sum2 + ".");
		
	}

}
