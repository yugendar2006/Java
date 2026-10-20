import java.util.*;
interface Shape{
     void calculateArea(double value);
}
class Circle implements Shape {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public void calculateArea(double value){
        value = Math.PI * radius * radius;
        System.out.println("Area of circle: "+ value);
    }
}
class Square implements Shape {
    double side;
    Square(double side){
        this.side = side;
    }
    public void calculateArea(double value){
        value = side * side;
        System.out.println("Area of Square: " + value);
    }
}
public class ShapeInterface{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name.equalsIgnoreCase("circle")){
            double radius = sc.nextDouble();
            Circle c1 = new Circle(radius);
            c1.calculateArea(radius);
        }
        else if(name.equalsIgnoreCase("square")) {
            double side = sc.nextDouble();
            Square s1 = new Square(side);
            s1.calculateArea(side);
        }
        else{
            System.out.println("No valid shape");
        }
    }
}