import java.util.*;
class OnlyDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
        if(!(ch >= '0' && ch <= '9'))
        {
            System.out.print("Not only digits");
            return;
        }
    }
            System.out.println("Only digits");
           
        }
    
    }
