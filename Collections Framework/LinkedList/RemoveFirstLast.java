import java.util.*;
class RemoveFirstLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Original LinkedList: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.print("Updated LinkedList: " + list);
    }
}