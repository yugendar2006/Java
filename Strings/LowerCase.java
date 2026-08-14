import java.util.*;
class LowerCase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        int j =str.length() - 1;
        for(int i=0;i<=j;i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
                count = count + 1;
        }
        System.out.print(count);
    }
}