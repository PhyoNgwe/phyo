package howework;
import java.util.Scanner;
public class ScrambleString {
	 public static String scrambleWord(String word) {
	        
	        if (word.length() <= 3) {
	            return word;
	        }
	        char[] chars = word.toCharArray();

	        int start = 1;
	        int end = word.length() - 2;

	        while (start < end) {
	            char temp = chars[start];
	            chars[start] = chars[end];
	            chars[end] = temp;

	            start++;
	            end--;
	        }//while End
	        return new String(chars);
	    }//scrambleWord End
	 public static String scrambleSentence(String sentence) {
	        String[] words = sentence.split(" "); // Split sentence into words
	        StringBuilder scrambledSentence = new StringBuilder();

	        for (String word : words) {
	            scrambledSentence.append(scrambleWord(word)).append(" ");
	        }//for End
	        return scrambledSentence.toString().trim();
	    }// Sentence methods End

  public static void main(String[] args) {
	 
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        String scrambledSentence = scrambleSentence(sentence);
	        System.out.println("Scrambled version: " + scrambledSentence);
	        scanner.close();
	    }//main End
	}//class End

