import java.util.*;
class Palindrome3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
         
         boolean flag = false;
        if(str.equals(rev)){
            flag = true;
        }

        if(flag){
            System.out.println("Palindrome");
        }

        else{
            System.out.println("Not Palindrome");
        }
    }
}