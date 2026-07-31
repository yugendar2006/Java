import java.lang;
import java.util.*;

class employee{
private double sal,hra,gs;
Employee(double sal){

  this.sal=sal;
}
double findHra(){
    if(sal>10000)
        hra=sal*(10.0/100);
    else
        hra=sal*(20.0/100);
    return hra;  
}
double findGs(){
    gs=sal+findHra();
    return gs;
}
}
class Mainclass{
public static void main(String args[]){ 
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the salary of employee");
    double sal=sc.nextDouble();
    Employee e=new Employee(sal);
    System.out.println("HRA of employee is:"+e.findHra());
    System.out.println("Gross salary of employee is:"+e.findGs());
}
} 