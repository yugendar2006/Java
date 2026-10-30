import java.util.*;
class UpdateElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.print("Original List");
        for(int i=0;i<5;i++){
           System.out.print(list.get(i)+" ");
        }
        System.out.println(" ");
         System.out.print("Enter index: ");
        int index = sc.nextInt();
        System.out.print("Enter new value: ");
        int value = sc.nextInt();
        list.add(index,value);
         System.out.print("Updated List");
        for(int i=0;i<5;i++){
           System.out.print(list.get(i)+" ");
        }
    }
}