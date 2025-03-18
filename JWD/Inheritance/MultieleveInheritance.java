package Inheritance;

class BabyDog extends Dog{
	void weep() {System.out.println("weeping....");}
}
public class MultieleveInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();
		d.weep();//class BabyDog
		d.bark();//class Dog
		d.eat();//class Animal
		
	}
}

