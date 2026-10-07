import java.util.*;
class Employee{
     String name;
     double salary;
     Employee(String n,double s){
        name = n;
        salary = s;
     }
}
public class EmployeeConstructor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double salary = sc.nextDouble();
        Employee e1 = new Employee(name,salary);
        System.out.println("Employee Details:");
        System.out.println("Name=" + e1.name);
        System.out.println("Salary=" + e1.salary);

    }
}