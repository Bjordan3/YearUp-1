import java.util.Scanner;
public class DayOfWeek {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Input a day and press Enter:\n");

		// do while loop for evaluating the day of the week

		String day = null;
		do {
			day = a.nextLine();

			EvaluateDayOfWeek(day);
			if (!day.equalsIgnoreCase("Quit")) {
				System.out.println(
						"Input a day and press Enter or input Quit when finish:");
			}

		} while (!day.equalsIgnoreCase("Quit"));

		// do while loop for switch statements

		// String day = null;
		// do {
		// day = a.nextLine();
		// switch (day) {
		// case "Monday" :
		// EvaluateDayOfWeek(day);
		// break;
		// case "Tuesday" :
		// EvaluateDayOfWeek(day);
		// break;
		// case "Wednesday" :
		// EvaluateDayOfWeek(day);
		// break;
		// case "Thursday" :
		// EvaluateDayOfWeek(day);
		// break;
		// case "Friday" :
		// EvaluateDayOfWeek(day);
		// break;
		// case "Saturday" :
		// EvaluateDayOfWeek(day);
		// break;
		// case "Sunday" :
		// EvaluateDayOfWeek(day);
		// break;
		// case "" :
		// EvaluateDayOfWeek(day);
		// break;
		// }
		// } while (!day.equals("Quit"));
	}

	public static void EvaluateDayOfWeek(String day) {
		if (day != null) {
			if (!day.isEmpty()) {
				if (day.equalsIgnoreCase("Monday")
						|| day.equalsIgnoreCase("Tuesday")
						|| day.equalsIgnoreCase("Wednesday")
						|| day.equalsIgnoreCase("Thursday")
						|| day.equalsIgnoreCase("Friday")) {
					System.out.println(
							"You have to go to work. Its is a weekday. ");
				} else
					if (day.equalsIgnoreCase("Saturday")
							|| (day.equals("Sunday"))) {
					System.out.println("Take the Day off. its the weekend");
				} else if (day.equalsIgnoreCase("Quit")) {
					System.out.println("Thank you for trying this code");
				}
			}

			else {
				System.out
						.println("This is a null string");
			}

		}
		
	}
}
