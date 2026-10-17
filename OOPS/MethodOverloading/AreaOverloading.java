class Area {
    void area(int side) {
        int area = side * side;
        System.out.println("Area of Square: "+area);
    }
    void area(int length,int breadth){
        int area = length * breadth;
        System.out.println("Area of rectangle: "+area);
    }
    void area(double radius){
        System.out.println("Area of circle: "+(Math.PI*radius*radius));
        System.out.println("Area of circle: "+(3.14*radius*radius));
    }
}
public class AreaOverloading {
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.area(10);
        a1.area(10,20);
        a1.area(5.3);
    }
}