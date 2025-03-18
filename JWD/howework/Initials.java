package howework;
import java.util.Scanner;
public class Initials {
	 public static String getInitials(String fullName) {
	        
	        String[] nameParts = fullName.split(" ");
	        
	        StringBuilder initials = new StringBuilder();
	        
	        for (String part : nameParts) {
	            initials.append(part.charAt(0));
	        }
	        
	        return initials.toString().toUpperCase(); 
	    }

   public static void main(String[] args) {
	        // Create a scanner to take user input
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your full name: ");
	        String fullName = scanner.nextLine();
	        
	        String initials = getInitials(fullName);
	        
	        System.out.println("Your initials are: " + initials);
	        
	        scanner.close();
	    }
	}