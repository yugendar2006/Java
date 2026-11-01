import java.util.*;
class AddFirstLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<3;i++){
            list.add(sc.nextInt());
        }
        int firstvalue = sc.nextInt();
        list.addFirst(firstvalue);
        int lastvalue = sc.nextInt();
        list.addLast(lastvalue);
        System.out.print("Updated LinkedList " + list);
    }
}