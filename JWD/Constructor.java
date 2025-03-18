
public class Constructor {
	public Constructor() {

		System.out.println("I am default constructor");
         int va=12;
		}
		public Constructor(String s) {

		System.out.println(s+" I am argument constructor");

		}
		public static void main(String [] args) {
		Constructor c1=new Constructor();
		Constructor c2=new Constructor("Jenny");

		}

		}

