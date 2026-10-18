import java.util.*;
class Shape{
    void area(){
    System.out.println("Area of shape is ");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void area(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is " + area);
    }
}
class Rectangle extends Shape {
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area() {
        int area = length * breadth;
        System.out.println("Area of rectangle is " + area);
    }
}
public class ShapeOverriding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        double radius = sc.nextDouble();
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        if(type.equalsIgnoreCase("circle")){
            Circle c1 = new Circle(radius);
            c1.area(); 
        }
        else if(type.equalsIgnoreCase("Rectangle")){
            Rectangle r1 = new Rectangle(length,breadth);
            r1.area();
        }
        else {
            System.out.println("Type valid shape");
        }
    }
}