package howework;
import java.util.Scanner;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
@Getter
@Setter

class product{
	String pdCode;
	String pdName;
	double pdPrice;
	
	public product(String pdCode,String pdName,double pdPrice) {
		this.pdCode=pdCode;
		this.pdName=pdName;
		this.pdPrice=pdPrice;
	}
	@Override
	public String toString() {
		return "Code:"+pdCode+", Name:"+pdName+", Price:"+pdPrice;
	}
	
}
public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<String,product> map=new HashMap<String,product>();
      map.put("100", new product("100","laptop",1200.50));
      map.put("P002", new product("P002", "Smartphone", 800.00));
      map.put("P003", new product("P003", "Tablet", 450.75));
      map.put("P004", new product("P004", "Smartwatch", 250.25));
      map.put("P005", new product("P005", "Headphone", 150.00));
      
      System.out.println("ALL Product");
      for(Map.Entry<String,product> entry:map.entrySet()) {
    	  System.out.println(entry.getValue());
      }
      
      String search="100";
      if(map.containsKey(search)) {
    	  System.out.println(map.get(search));
      }
      else {System.out.println("Not Found!");}
      
      System.out.println("_________________");
      Scanner s=new Scanner(System.in);
      System.out.println("Ente your Code");
      String newcod=s.nextLine();
      if(map.containsKey(newcod)) {
    	  System.out.println(map.get(newcod));
      }
      else {System.out.println("Not Found cod");}
	}

}
