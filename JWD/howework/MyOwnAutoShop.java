package howework;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create instances of Sedan class
        Sedan sedan1 = new Sedan(120, 25000, "Red", 22);
        System.out.println("Sale Price of Sedan 1: " + sedan1.getSalePrice());

        // Create instances of Ford class
        Ford ford1 = new Ford(150, 30000, "Blue", 2020, 2000);
        System.out.println("Sale Price of Ford 1: " + ford1.getSalePrice());

        Ford ford2 = new Ford(130, 28000, "Black", 2021, 1500);
        System.out.println("Sale Price of Ford 2: " + ford2.getSalePrice());

        // Create an instance of Car class
        Car car1 = new Car(100, 22000, "White");
        System.out.println("Sale Price of Car 1: " + car1.getSalePrice());

        // Create an instance of Truck class
        Truck truck1 = new Truck(80, 40000, "Green", 2500);
        System.out.println("Sale Price of Truck 1: " + truck1.getSalePrice());
	}

}
