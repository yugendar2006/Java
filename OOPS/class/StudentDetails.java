import java.util.*;
class Student{
    String name;
    int age;
    int marks;
}
public class StudentDetails{
    public static void main(String[] args){
       Student s1 = new Student();
       s1.name = "yugendar";
       s1.age = 20;
       s1.marks = 945;
       System.out.println("Name"+"="+s1.name);
       System.out.println("Age"+"="+s1.age);
       System.out.println("Marks"+"="+s1.marks);
       
    }
}
