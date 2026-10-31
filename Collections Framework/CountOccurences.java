import java.util.*;
class CountOccurences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<8;i++){
            list.add(sc.nextInt());
        }
        int value = sc.nextInt();
        int count = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==value){
                count++;
            }
        }
        System.out.print(value+" occurs "+count+" times");
    }
}