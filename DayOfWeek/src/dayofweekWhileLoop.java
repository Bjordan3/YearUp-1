import java.util.Scanner;
public class dayofweekWhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String dayofweek = "Start";

		while (!dayofweek.equalsIgnoreCase("Quit")) {
			System.out.println(
					"Enter a day of the week and type Quit when you finish:\n");
			dayofweek = s.nextLine();

			switch (dayofweek) {
				case "Monday" :
					System.out.println("I don't want to go to work");
					break;
				case "Tuesday" :
					System.out.println("I don't want to go to work");
					break;
				case "Wednesday" :
					System.out.println("I don't want to go to work");
					break;
				case "Thursday" :
					System.out.println("I don't want to go to work");
					break;
				case "Friday" :
					System.out.println("I don't want to go to work");
					break;
				case "Saturday" :
					System.out.println("Party, PARTY, PARTY!!!!!");
					break;
				case "Sunday" :
					System.out.println("Sleep, SLEEP, SLEEP!!!!!!!!!!!");
					break;
			}
		}
	}

}
