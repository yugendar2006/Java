import java.util.*;
class Consonants{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        int j = str.length() - 1;
        for(int i=0;i<=j;i++){
            if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u')
               count = count + 1;
        }
        System.out.print(count);
    }
}