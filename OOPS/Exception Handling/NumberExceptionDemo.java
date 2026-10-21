import java.util.*;
public class NumberExceptionDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try { 
            Integer.parseInt(input);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Number");
        }
        System.out.println("Program Completed");
    }
}