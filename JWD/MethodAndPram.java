
public class MethodAndPram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(methodA("David"));
		
		MethodAndParam2 obj1=new MethodAndParam2();
		System.out.println(obj1.methodB("David"));
		
		
		MethodAndPram obj=new MethodAndPram();
		System.out.println(obj.methodC("David"));
	}
	public static String methodA(String s) {
		return "Hello " + s;
	}
	
	public String methodC(String s) {
		return "Hello " + s;
	}
}
