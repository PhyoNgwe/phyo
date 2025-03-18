package collectionfarmwork;
import java.util.*;
public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("Kathy");
		list.add("Doll");
		list.add("Chris");
		list.add("Suzy");
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		while(itr.hasNext()) {
		String value=(String) itr.next();
		System.out.println(value);
	    }

}
}