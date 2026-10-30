import java.util.*;
class ArrayListDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Size: " + list.size());
    }
}