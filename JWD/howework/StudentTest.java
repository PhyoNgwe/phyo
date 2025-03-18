package howework;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;
@Getter
@Setter


  class Student{
	  String Id;
	  String Name;
	  int age;
	  public Student(String Id,String Name,int age) {
		  this.Id=Id;
		  this.Name=Name;
		  this.age=age;
	  }
	  @Override
	  public String toString() {
		  return "Id :"+Id+", Name :"+Name+", Age :"+age;
	  }
  }

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Student> stu=new ArrayList<Student>();
        stu.add(new Student("111","Tun Tun",20));
        stu.add(new Student("222","Kyaw Kyaw",17));
        stu.add(new Student("333","Yu Yu",23));
        stu.add(new Student("444","Thu Thu",14));
        stu.add(new Student("555","Pu Pu",34));
        
        System.out.println("Student under 20");
        for(Student s:stu) {
        	if(s.getAge()<20) {
        		System.out.println(s);
        	}
        }
        System.out.println("________________________");
        LinkedList<Student>stul=new LinkedList<Student>();
        stul.add(new Student("666","U Lay",42));
        stul.add(new Student("777","Ran Man",21));
        stul.add(new Student("888","Paing Gyi",16));
        stul.add(new Student("999","Mu Mu",20));
        stul.add(new Student("000","U U",19));
        
        System.out.println("Student over 20");
        for(Student s:stul) {
        	if(s.getAge()>20) {
        		System.out.println(s);
        	}
        }
	}

}
