import java.util.*;
class SearchLinkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        int value = sc.nextInt();
        if(list.contains(value)){
            System.out.print("Element found");
        }
        else{
            System.out.print("Element not found");
        }
    }
} 
