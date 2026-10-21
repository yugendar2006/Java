import java.util.*;
interface Employee{
    void calculateSalary(double basicSalary);
}
class FullTimeEmployee implements Employee {
    int salary;
    FullTimeEmployee(int salary){
        this.salary = salary;
        }
    public void calculateSalary(double basicSalary){
         basicSalary = salary + 5000;
        System.out.println("Final Salary " + basicSalary);
    }
}
class PartTimeEmployee implements Employee {
    int salary;
    PartTimeEmployee(int salary){
        this.salary = salary;
    }
    public void calculateSalary(double basicSalary){
        basicSalary = salary + 2000;
        System.out.println("Final Salary " + basicSalary);
    }
}
public class EmployeeInterface{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name.equalsIgnoreCase("fulltimeemployee")){
            int salary = sc.nextInt();
            double basicSalary;
            FullTimeEmployee f1 = new FullTimeEmployee(salary);
            f1.calculateSalary(salary);
        }
        else if(name.equalsIgnoreCase("parttimeemployee")){
            int salary = sc.nextInt();
            double basicSalary;
            PartTimeEmployee p1 = new PartTimeEmployee(salary);
            p1.calculateSalary(salary);
        }
        else{
            System.out.println("Invalid employee");
        }
    }
}