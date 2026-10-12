class Student{
    private String name;
    private int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
}
public class StudentEncapsulation{
    public static void main(String[] args){
        Student s1 = new Student("Yugendar",20);
        System.out.println("name"+"="+s1.getname());
        System.out.println("age"+"="+s1.getage());
    }
}
