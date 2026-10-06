import java.util.*;
class Rectangle {
    int length;
    int breadth;
}
public class RectangleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Rectangle r1 = new Rectangle();
        r1.length = length;
        r1.breadth = breadth;
        int area = r1.length * r1.breadth;
        System.out.println("Area"+"="+area);
    }
}