class Student{
    String name;
    int age;

    Student(String n,int a){
        name = n;
        age = a;
    }
}
public class StudentConstructor{
    public static void main(String[] args){
        Student s1 = new Student("yugendar",19);
        System.out.println("Name"+"="+s1.name);
        System.out.println("Age"+"="+s1.age);
    }
}
