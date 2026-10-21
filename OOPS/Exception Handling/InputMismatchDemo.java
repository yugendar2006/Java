import java.util.*;
public class InputMismatchDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        try{
            int n = sc.nextInt();
            System.out.println(n*2);
        }
        catch(InputMismatchException e){
             System.out.println("Invalid input");
        }
        System.out.println("Program Completed");
    }
}