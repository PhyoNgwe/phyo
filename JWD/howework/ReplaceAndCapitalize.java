package howework;
import java.util.Scanner;
public class ReplaceAndCapitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your word");
       
       // sp for nextline 
      String word=sc.nextLine();
      String result=word.toUpperCase();
      result=result.replace("A","@");
      System.out.println(result);
	}

}
