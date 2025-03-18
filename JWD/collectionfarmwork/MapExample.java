package collectionfarmwork;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // HashMap Example (No order is maintained)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(2, "Orange");
        hashMap.put(4, "Mango");
        System.out.println("HashMap: " + hashMap); 

        // LinkedHashMap Example (Maintains insertion order)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(1, "Banana");
        linkedHashMap.put(2, "Orange");
        linkedHashMap.put(4, "Mango");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap Example (Sorts keys in natural order)
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");
        treeMap.put(4, "Mango");
        System.out.println("TreeMap: " + treeMap);
	}

}
