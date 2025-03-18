package string;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "the are open"; // as if by magic, the value

		// of each char
		// is the same as its index!
		System.out.println(x.substring(5)); // output "56789"
		System.out.println(x.substring(5, 8)); // output "567"
	}

}
