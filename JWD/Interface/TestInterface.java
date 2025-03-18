package Interface;
  interface Printable{
          void print();

}
   interface Showable{
            void show();

}
public class TestInterface implements Printable,Showable {
     public void print() {System.out.println("Hello");}
     public void show() {System.out.println("Welcome");}
public static void main(String[] args) {
		// TODO Auto-generated method stub
     TestInterface obj=new TestInterface();
     obj.print();
     obj.show();
	}

}
