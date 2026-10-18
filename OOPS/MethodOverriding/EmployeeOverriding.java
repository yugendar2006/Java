import java.util.*;
class Employee {
    int salary;
    Employee(int salary){
        this.salary = salary;
    }
    void calculatesalary() {
        System.out.println("Employee salary is " + salary);
    }
}
class Manager extends Employee {
    Manager(int salary){
        super(salary);
    }
    void calculatesalary() {
        System.out.println("Manager salary is " + salary);
    }
}
class Developer extends Employee {
    Developer(int salary) {
        super(salary);
    }
    void calculatesalary() {
        System.out.println("Developer salary is " + salary);
    }
}
public class EmployeeOverriding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int salary = sc.nextInt();

        if (type.equalsIgnoreCase("Manager")) {
            Manager m = new Manager(salary);
            m.calculatesalary();
        } else if (type.equalsIgnoreCase("Developer")) {
            Developer d = new Developer(salary);
            d.calculatesalary();
        } else if (type.equalsIgnoreCase("Employee")) {
            Employee e = new Employee(salary);
            e.calculatesalary();
        } else {
            System.out.println("Invalid employee type");
        }
    }
}