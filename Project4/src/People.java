
public class People {

	public static void main(String[] args) {
	
   Person person = new Person(34);
   person.NName = "Jacquawn";
   person.NPhoneNumber = "678 357 8435";
   person.setNAddress("987 Burns Drive Atlanta, Georgia");
   System.out.println(person.NName);
   System.out.println(person.getNAddress());
	}

}