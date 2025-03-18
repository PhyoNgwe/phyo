package collectionfarmwork;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashSet<String> set = new LinkedHashSet<>();

	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        set.add("Apple");  // Duplicate element (will not be added)
	        set.add(null);      // Adding null value

	        System.out.println("LinkedHashSet contains: " + set);

	        if (set.contains("Banana")) {
	            System.out.println("Banana is present in the LinkedHashSet.");
	        }

	        set.remove("Cherry");
	        System.out.println("After removing Cherry: " + set);
	        
	        System.out.println("Size of LinkedHashSet: " + set.size());
	        set.clear();
	        System.out.println("After clearing the LinkedHashSet: " + set);
	}

}
