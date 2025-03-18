import java.util.Scanner;
public class Steelproducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your hardness");
    int hardness=s.nextInt();
    System.out.println("Enter your carbon");
    double carbon=s.nextDouble();
    System.out.println("Enter your tensile");
    int tensile=s.nextInt();
    
  if(hardness > 50 && carbon < 0.7 && tensile > 5600) 
	  {System.out.println("Grade 10");}
  else if(hardness > 50 && carbon < 0.7) 
      {System.out.println("Grade 9");}
  else if(carbon < 0.7 && tensile > 5600)
      {System.out.println("Grade 8");}
  else if(hardness > 50 && tensile > 5600)
      {System.out.println("Grade 7");}
  else if( hardness > 50 || carbon < 0.7 || tensile > 5600)
      {System.out.println("Grade 6");}
  else {System.out.println("Grade 5");}
}
}