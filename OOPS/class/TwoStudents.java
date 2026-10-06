class Student{
    String name;
    int age;
}
public class TwoStudents{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "ravi";
        s1.age = 21;
        s2.name = "priya";
        s2.age = 19;
        System.out.println("Name"+"="+s1.name);
        System.out.println("Age"+"="+s1.age);
        System.out.println("Name"+"="+s2.name);
        System.out.println("Age"+"="+s2.age);
    }
}