package howework;

  class GenericContainer<T>{
	T obj;
	public GenericContainer(T obj){
		this.obj=obj;
	}
	
	public  String toString() {
		return obj.toString();
	}
}
 class Container {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GenericContainer<String> str= new GenericContainer<>("Thuu");
        System.out.println(str);
        
        GenericContainer<Integer> inte=new GenericContainer<>(1000);
        System.out.println(inte);
        
        GenericContainer<Double> emp=new GenericContainer<>(20.5);
        System.out.println(emp); 
        
        
	}

}
