import java.util.*;
class PrintCharacters{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int j = str.length()-1;
        for(int i = 0;i <= j;i++){
          System.out.println(str.charAt(i));
        }
    }
}