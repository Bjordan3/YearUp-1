
public class People {

	public static void main(String[] args) {
	
   Person person = new Person(34);
   person.NName = "Jacquawn";
   person.NPhoneNumber = "678 357 8435";
   person.setNAddress("987 Burns Drive Atlanta, Georgia");
   System.out.println(person.NName);
   System.out.println(person.getNAddress());
   System.out.println("Jacquawn is " + person.NAge );
   System.out.println("Today is December 5th ");
   person.GrowsOlder();
   System.out.println("Persons name is now " + person.getNAge());
   Person K = new Person("Krash", "678 357 8435", "1058 Crestmont Lane", 21);
   System.out.println(K.NName);
   System.out.println(K.NAge);
   System.out.println(K.getNAddress());
   K.GrowsOlder();
   System.out.println(K.NAge);
   Person Dierdre = new Person(24);
   
   
   Dierdre.GrowsOlder();
   System.out.println(Dierdre.NAge);
   Dierdre.setNAddress(" 74 Darbys Crossing Point HIram Georgia");
   System.out.println(Dierdre.getNAddress());


	}
   
	

}
