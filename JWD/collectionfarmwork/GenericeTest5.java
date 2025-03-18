package collectionfarmwork;
import java.util.ArrayList;
import java.util.List;

public class GenericeTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> list1=new ArrayList();
	    list1.add(new Animal());
	    list1.add(new Dog());
	    list1.add(new Cat());
	    print(list1);
	    display(list1);
	    System.out.println("_________");
	    List<Dog> list2=new ArrayList();
	    list2.add(new Dog());
	    print(list2);
	    display(list2);
	    System.out.println("_________");
	    List<Cat> list3=new ArrayList();
	    list3.add(new Cat());
	    print(list3);
	    //display(list3); 
	}
	public static void print(List<? extends Animal>list){
	    List list4=list;
	    for(Object o:list4)
	    System.out.println(o);
	}
	public static void display(List<? super Dog >list){
	    List list5=list;
	    for(Object o:list5)
	    System.out.println(o);
	}

}
