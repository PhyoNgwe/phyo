package collectionfarmwork;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set = new HashSet<>();

	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        set.add("Apple");  // Duplicate element (will not be added)
	        set.add(null);      // Adding null value

	        
	        System.out.println("HashSet contains: " + set);

	        if (set.contains("Banana")) {
	            System.out.println("Banana is present in the HashSet.");
	        }

	       
	        set.remove("Cherry");
	        System.out.println("After removing Cherry: " + set);
	        System.out.println("Size of HashSet: " + set.size());

	        set.clear();
	        System.out.println("After clearing the HashSet: " + set);
	}

}
