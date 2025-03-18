package collectionfarmwork;
class MyGen<S> {
	S obj;
	void add(S obj){
	this.obj=obj;
	}
	S get(){
	return obj;
	}
}
public class GenericsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGen<Integer> m1=new MyGen<Integer>();// type safety 
		MyGen<Double> m=new MyGen<Double>();//no type safety
		m1.add(2);
		m.add(2.8);
		System.out.println(m1.get());
		MyGen<String> m2=new MyGen<String>();
		m2.add("Hello");
		System.out.println(m2.get());
	}

}
