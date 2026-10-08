class Employee{
    String name;
    double salary;
    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
}
public class Employeethis{
    public static void main(String[] args){
        Employee e1 = new Employee("Yugendar",25000.50);
        Employee e2 = new Employee("Rahul",30000.75);
        System.out.println("Employee Details:");
        System.out.println("employee name"+"="+ e1.name);
        System.out.println("employee salary"+"="+ e1.salary);
        System.out.println("employee name"+"="+ e2.name);
        System.out.println("employee salary"+"="+ e2.salary);
    }
}