import java.util.*;
class SearchElementList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        int element = sc.nextInt();
        if(list.contains(element)){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}