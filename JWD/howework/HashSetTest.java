package howework;
import java.util.*;
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		
		set.add("John");
		set.add("Marry");
		set.add("David");
		set.add("Smith");

		System.out.println(set);
		
		LinkedHashSet<String> set2=new LinkedHashSet<String>();	
		set2.add("John");
		set2.add("Marry");
		set2.add("David");
		set2.add("Smith");
		set2.add(null);
        System.out.println(set2);
        
        TreeSet<String> set3=new TreeSet<String>();
        set3.add("John");
		set3.add("Marry");
		set3.add("David");
		set3.add("Smith");
		set3.add(null);
        System.out.println(set);
        }
}
