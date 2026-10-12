class Employee{
    private String name;
    private double Salary;

    Employee(String name,double Salary){
        this.name = name;
        this.Salary = Salary;
    }

    public String getname(){
        return name;
    }
    public double getSalary(){
        return Salary;
    }
}

public class EmployeeEncapsulation{
    public static void main(String[] args){
        Employee e1 = new Employee("Yugendar",25000.5);
        Employee e2 = new Employee("Arun",3000.75);
        System.out.println("Employee e1: ");
        System.out.println("Name"+"="+e1.getname());
        System.out.println("Salary"+"="+e1.getSalary());
        System.out.println("Employee e2: ");
        System.out.println("Name"+"="+e2.getname());
        System.out.println("Salary"+"="+e2.getSalary());
    }
}