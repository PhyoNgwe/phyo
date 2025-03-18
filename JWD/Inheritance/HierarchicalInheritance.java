package Inheritance;

class Cat extends Animal{

   void meow(){System.out.println("meowing...");}

}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.bark(); d.eat();
		Cat c=new Cat();
		c.meow(); c.eat();
	}

}
