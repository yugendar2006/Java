import java.util.*;
class HashsetInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        System.out.print(set);
        System.out.println(set.size());
    }
}