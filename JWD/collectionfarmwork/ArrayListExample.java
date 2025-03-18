package collectionfarmwork;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> fruit=new ArrayList<String>();
       fruit.add("apple");
       fruit.add("apple");
       fruit.add("banana");
       fruit.add("mango");
       fruit.add(null);
       
       System.out.println(fruit);
       System.out.println(fruit.get(3));
       fruit.remove("apple");
       System.out.println("Updated fruit"+fruit);
       System.out.println("Size of fruit:"+fruit.size());
       
       ArrayList<String> morefruit=new ArrayList<String>();
       morefruit.add("uoof");
       morefruit.add("goup");
       
       fruit.addAll(morefruit);
       System.out.println("comebind "+fruit);
       
       fruit.clear();
       System.out.println(fruit);
       }

}
