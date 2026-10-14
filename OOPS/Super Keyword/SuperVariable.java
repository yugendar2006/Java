class Person {
    String name = "Parent Name";
}
class Student extends Person {
    String name = "Student Name";

    void displayName(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

public class SuperVariable{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.displayName();
    }
}