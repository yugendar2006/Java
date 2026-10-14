class Person {
    String name;
    Person(String name){
        this.name = name;
    }
    void displayName() {
        System.out.print("name: "+this.name);
    }
}
class student extends Person {
    student(String name){
        super(name);
    }
}
public class SuperParameterizedConstructor{
    public static void main(String[] args){
        student s1 = new student("Rahul");
        s1.displayName();
    } 
}