package howework;
import java.util.Scanner;
public class RepeatedCharacter1 {
	public static void findRepeatedCharacters(String input) {
  
        char[] chars = input.toCharArray();
        
        int[] charCount = new int[256]; 

        for (char c : chars) {
            charCount[c]++;
        }

       
        System.out.println("Repeated characters:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        System.out.println("Enter your Word");
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();
	        findRepeatedCharacters(input);
	      
	}

}
