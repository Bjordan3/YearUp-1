import java.util.Scanner;
public class DayOfWeek {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
//		// do while loop for evaluating the day of the week
//		System.out.println("Enter a new day of week or Quit to exit:");
//		String day = null;
//		day = a.nextLine();
//		do{
//		EvaluateDayOfWeek(day);
//		}
//		 while (!day.equals("Quit")); 
		
		//do while loop for switch statements
		
		String day = "Start";
		day = a.nextLine();
		 do {
		 System.out.println("Enter a new day of week or Quit to exit:");
		 day = a.nextLine();
		 switch (day) {
		 case "Monday" :
		 EvaluateDayOfWeek(day);
		 break;
		 case "Tuesday" :
		 EvaluateDayOfWeek(day);
		 break;
		 case "Wednesday" :
		 EvaluateDayOfWeek(day);
		 break;
		 case "Thursday" :
		 EvaluateDayOfWeek(day);
		 break;
		 case "Friday" :
		 EvaluateDayOfWeek(day);
		 break;
		 case "Saturday" :
		 EvaluateDayOfWeek(day);
		 break;
		 case "Sunday" :
		 EvaluateDayOfWeek(day);
		 break;
		 case "" :
		 EvaluateDayOfWeek(day);
		 break;
		 }
		 } while (!day.equals("Quit"));
	}

	public static void EvaluateDayOfWeek(String day) {

		if (!day.isEmpty()) {

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

		else {
			System.out.println("You didnt enter anything please try again.");
		}

	}

}
