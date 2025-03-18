package superkeyword;

public class Animal {
	
		String color="white";
		 Animal(){
		System.out.println("Animal Constructor...");
		}
		void eat() {
		System.out.println("eating...");
		}
		
}

  class Dog extends Animal {
		String color="black";
		Dog(){
		super();{}//calls animal constructor
		System.out.println("Dog Constructor...");
		}
		void eat() {
		super.eat();//calls eat method from Animal
		
		System.out.println("eating bread...");
		}
		void printColor(){
			System.out.println(super.color);//prints color of
			
			System.out.println(color);//prints color of Dog class
			}
   }
