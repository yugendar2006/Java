import java.util.*;
class LinkedListDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        System.out.print("Size of linkedlist "+list.size());
    }
}