class Person{
 void displayName(){
    System.out.println("Iam a person");
 }
}
class Student extends Person{
    void displayStudent() {
        System.out.println("Iam a student");
    }
}
public class StudentInheritance{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.displayName();
        s1.displayStudent();
    }
}