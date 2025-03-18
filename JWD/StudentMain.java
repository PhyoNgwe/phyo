
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.name = "Mg Mg";
		obj.age = 20;

		System.out.println(obj.name);

		Student obj1 = new Student("Su Su", 20);
		System.out.println(obj1.name);
		System.out.println(obj1.age);
	}

}
