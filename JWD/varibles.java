
public class varibles {
	//int count = 1;
		static int count = 1;

		public static int increaseCount() {
			return ++count;
		}
		
		static int number;
		
		static {
			number =2;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//varibles obj1 = new varibles();
				System.out.println(increaseCount());
				int i=Integer.parseInt("2344");
				System.out.println(i);
				//varibles obj2 = obj1;
				System.out.println(increaseCount());
				System.out.println(number);
	}
}

