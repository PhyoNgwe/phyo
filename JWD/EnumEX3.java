import java.util.Scanner;
public class EnumEX3 {
	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		String a=s.next().toUpperCase();
		
		 
		try {
		Day day = Day.valueOf(a);
		switch (day) {

		case SUNDAY:
		case SATURDAY:
		System.out.println("Sunday is best");
		break;
		case MONDAY:
		System.out.println("Monday is bad");
		break;
		default:
		System.out.println("Other day are not bad");

		}
		}catch(IllegalArgumentException e) {
			System.out.println("Invalid Data!");
		}
		
		s.close();
		System.out.println("hello");
	
	}

}
