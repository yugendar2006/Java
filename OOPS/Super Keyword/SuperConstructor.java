class Person {
    Person(){
        System.out.println("Person Constructor called");
    }
}
class Student extends Person {
    Student(){
        super();
        System.out.println("Student Constructor called");
    }
}
public class SuperConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}