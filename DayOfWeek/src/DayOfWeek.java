import java.util.Scanner;
public class DayOfWeek {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a new day of week:\n");
		String day = null;
		day = a.next();
		
		if (day.equals("Monday") || (day.equals("Tuesday"))
				|| (day.equals("Wednesday")) || (day.equals("Thursday"))
				|| (day.equals("Friday"))) {
			System.out.println("You have to go to work. ");
		} else if (day.equals("Saturday") || (day.equals("Sunday"))) {
			System.out.println("Take the Day off");
		} else {
			System.out.println("That is not a valid day");

		}

	}
	public static void EvaluateDayOfWeek(String DayOfWeek) {
		Scanner b = new Scanner(System.in);
		DayOfWeek = b.nextLine();

		if (DayOfWeek.equals(null)) {
			System.out.println("This is empty. Please try again");
		}

	}
	public String IsEmpty() {
		String ne = "This is not empty";
		return ne;
	}
}