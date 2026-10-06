import java.util.*;
class Employee{
    String name;
    int salary;
}
public class EmployeeDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int salary = sc.nextInt();
        Employee e1 = new Employee();
        e1.name = name;
        e1.salary = salary;
        System.out.println("Employee Details:");
        System.out.println("Name"+"="+name);
        System.out.println("Salary"+"="+salary);
    }
}