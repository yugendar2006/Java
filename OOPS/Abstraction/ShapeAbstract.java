import java.util.*;
abstract class Shape {
    abstract void area();
}
class Circle extends Shape {
    double radius;
    Circle(double radius){
    this.radius = radius;
    }
    void area() {
         double area = Math.PI * radius * radius;
         System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    int length, breadth;
   Rectangle( int length,int breadth){
    this.length = length;
    this.breadth = breadth;
   }
    void area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class ShapeAbstract{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name.equalsIgnoreCase("circle")) {
            double radius = sc.nextDouble();
            Circle c1 = new Circle(radius);
            c1.area();
        }
        else if(name.equalsIgnoreCase("Rectangle")) {
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            Rectangle r1 = new Rectangle(length,breadth);
            r1.area();
        }
        else {
            System.out.println("No valid name");
        }
    }
}