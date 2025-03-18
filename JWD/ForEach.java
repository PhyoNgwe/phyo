
public class ForEach {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] ary= {"A","B","c","D"};
        int count=0;
        for(String s:ary) {
           if(count==2)
        	{System.out.println((count)+"."+s);}
           count++;
	}

}
}