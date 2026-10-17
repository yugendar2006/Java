class calculator {
    void add(int a, int b) {
        System.out.println("Sum of two numbers: "+(a+b));
    }
    void add(int a,int b,int c) {
        System.out.println("Sum of three numbers: "+(a+b+c));
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.add(10,20);
        c1.add(10,20,30);
    }
}
