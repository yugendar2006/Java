import java.util.*;
class Student {
    void display(String StudentName){
        System.out.println("Student name: " + StudentName);
    }
    void display(String StudentName,int StudentAge){
        System.out.println("Student name: " + StudentName);
        System.out.println("Student age: " + StudentAge);
    }
    void display(String StudentName,int StudentAge,double Marks){
        System.out.println("Student name: " + StudentName);
        System.out.println("Student age: " + StudentAge);
        System.out.println("Student marks: " + Marks);
    }
}
public class DisplayOverloading {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Enter marks: ");
        double marks = sc.nextDouble();
        Student s1 = new Student();
        s1.display(name);
        s1.display(name,age);
        s1.display(name,age,marks);
    }
}