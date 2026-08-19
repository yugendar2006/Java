import java.util.*;
class ReplaceCharacter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            char ch1 = str.charAt(i);
            if( ch1 == ch)
                {
                System.out.print(newChar);
                }
            else
                {
                System.out.print(ch1);
                }
            }
        }
    }
