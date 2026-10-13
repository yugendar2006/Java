import java.util.*;
class Shape {
    void displayShape(String shapeName) {
        System.out.println("Shape Name: "+shapeName);
    }
}
class Circle extends Shape {
    void displayRadius(double radius) {
        System.out.println("Circle Radius: "+radius);
    }
}
public class ShapeInheritance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Shape Name: ");
        String shapeName = sc.next();
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        Circle c1 = new Circle();
        c1.displayShape(shapeName);
        c1.displayRadius(radius);
    }
}