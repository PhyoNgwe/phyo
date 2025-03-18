package collectionfarmwork;
import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Integer> set = new TreeSet<>();

	        set.add(10);
	        set.add(20);
	        set.add(30);
	        set.add(20);  // Duplicate element (will not be added)
	         //set.add(null);  // Throws NullPointerException because TreeSet does not allow null element
	        System.out.println("TreeSet contains: " + set);

	       
	        if (set.contains(20)) {
	            System.out.println("20 is present in the TreeSet.");
	        }

	    
	        set.remove(10);
	        System.out.println("After removing 10: " + set);

	        System.out.println("Size of TreeSet: " + set.size());

	        set.clear();
	        System.out.println("After clearing the TreeSet: " + set);
	}

}
