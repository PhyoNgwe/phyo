package Polymorphism;
class Bank{

int getRateOfInterest(){return 0;}

}
class KBZ extends Bank{

int getRateOf(){return 8;}

}
class AYA extends Bank{ 

int Interest(){return 7;}

}
public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KBZ s=new KBZ();
		AYA i=new AYA();

		System.out.println("KBZ Rate of Interest: "+s.getRateOf());
		System.out.println("AYA Rate of Interest: "+i.Interest());
	}

}
