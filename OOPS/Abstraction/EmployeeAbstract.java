import java.util.*;
abstract class Employee {
    abstract void CalculateSalary();
}
class FullTimeEmployee extends Employee {
    int salary;
    FullTimeEmployee(int salary){
        this.salary = salary;
    }
    void CalculateSalary(){
    System.out.println("Monthly Salary: " + salary);
    }
}
class PartTimeEmployee extends Employee {
    int hoursWorked;
    int hourlyrate;
    PartTimeEmployee(int hoursWorked,int hourlyrate){
        this.hoursWorked = hoursWorked;
        this.hourlyrate = hourlyrate;
    }
    void CalculateSalary(){
        int salary = hoursWorked * hourlyrate;
        System.out.println("Part-Time Salary: " + salary);
    }
}
public class EmployeeAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name.equalsIgnoreCase("fulltime")){
            int salary = sc.nextInt();
            FullTimeEmployee f1 = new FullTimeEmployee(salary);
            f1.CalculateSalary();
        }
        else if(name.equalsIgnoreCase("parttime")){
            int hoursWorked = sc.nextInt();
            int hourlyrate = sc.nextInt();
            PartTimeEmployee p1 = new PartTimeEmployee(hoursWorked,hourlyrate);
            p1.CalculateSalary();
        }
        else {
            System.out.println("Invalid name");
        }
    }
}