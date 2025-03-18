package string;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1 = new String("This is really not immutable!!");
		String Str4 = new String("THIS IS REALLY NOT IMMUTABLE!!");
		boolean retVal;

		retVal = Str1.equalsIgnoreCase(Str4);
		System.out.println("Returned Value = " + retVal);

		retVal = Str1.equals(Str4);
		System.out.println("Returned Value = " + retVal);
	}

}
