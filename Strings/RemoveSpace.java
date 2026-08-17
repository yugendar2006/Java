import java.util.*;
class RemoveSpace{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace(" ","");
        System.out.print(str);
    }
}