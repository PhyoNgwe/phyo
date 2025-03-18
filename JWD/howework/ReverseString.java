package howework;

public class ReverseString {
    public static void printReversed(String input) {
    	for(int i=input.length()-1;i>=0;i--) {
    		//reverse decrease -- forloop out
    		System.out.print(input.charAt(i));
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name="Hello";
       // ReverseString.printReversed("Hello");
        printReversed(name);
	}
	

}
