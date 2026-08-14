import java.util.*;
class FirstAndLast{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char First = str.charAt(0);
        char Last = str.charAt(str.length()-1);
           System.out.println(First);
           System.out.println(Last);
    }
}