class Person {
    String name;
    Person(String name){
        this.name = name;
    }
    void display(){
        System.out.println("name: "+this.name);
    }
}
class Employee extends Person {
    double salary;
    Employee(String name,double salary){
        super(name);
        this.salary = salary;
    }
    void display(){
        super.display();
        System.out.println("Salary: "+this.salary);
    }
}
public class SuperEmployee{
    public static void main(String[] args){
        Employee e1 = new Employee("Rahul",30000);
        e1.display();
    }
}
