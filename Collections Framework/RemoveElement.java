import java.util.*;
class RemoveElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.print("Original list "+": ");
        for(int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        list.remove(index);
        System.out.print("Updated list "+": ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}