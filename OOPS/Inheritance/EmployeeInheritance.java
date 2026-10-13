import java.util.*;
class Person {
    void displayName(String name){
        System.out.println("Employee Name: "+ name);
    }
}
class Employee extends Person {
    void displaySalary(double salary) {
        System.out.println("Employee Salry: "+ salary);
    }
}
public class EmployeeInheritance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name : ");
        String name = sc.next();
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        Employee e1 = new Employee();
        e1.displayName(name);
        e1.displaySalary(salary);

    }
}