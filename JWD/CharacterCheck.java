import java.util.Scanner;
public class CharacterCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String Answer;
	do {
		System.out.println("Enter the Character");
		char character=s.next().charAt(0);
		
		if(Character.isLowerCase(character)) {
			System.out.println("This is LowerCase Character");
		}
		else if(Character.isUpperCase(character)) {
			System.out.println("This is UpperCase Character");
		}
		else if(Character.isDigit(character)) {
			System.out.println("This is Digit Character");
		}
		else {System.out.println("This is Specil Symbol");}
		
		{System.out.println("Again Wite? Yes or No");}
		s.nextLine();
		Answer=s.nextLine();
	}while(Answer.equalsIgnoreCase("Yes"));
	// do_while End
	System.out.println("Thank You");
	s.close();
	}//public main End

}//class End
