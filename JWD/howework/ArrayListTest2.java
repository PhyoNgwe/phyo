package howework;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst=new ArrayList();
		lst.add(1);
		lst.add('c');
		lst.add(true); 
		lst.add(2.3);
		lst.add("java");
		System.out.println(lst);

		lst.add(new Emloyee1());
		System.out.println(lst);
		System.out.println(lst.get(1));

		double number= (double)lst.get(3);
		System.out.println(number);
		
		List<String>languags=new ArrayList<String>();
		languags.add("true");
		languags.add("false");
		String value=languags.get(0);
		String value1=languags.get(1);
		
		System.out.println(value);
		System.out.println(value1);
	}
}
