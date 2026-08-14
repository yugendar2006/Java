import java.util.*;
class Frequency{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        int count = 0;
             for(int i=0;i<=str.length() - 1;i++){
                
                    if(str.charAt(i) == ch)
                        count = count+1;
             }
             System.out.print(count);
    }
}