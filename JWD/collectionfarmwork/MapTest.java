package collectionfarmwork;
import java.util.*;
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100,"Sue");
		map.put(101,"Mary");
		map.put(102,"Jones");
		//Elements can traverse in any order
		for(Map.Entry<Integer,String> m:map.entrySet()){

		System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
