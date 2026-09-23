public class FirstOccurence{
    public static void main(String[] args){
        int[] arr = {10,20,30,20,40,20};
        int target = 20;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print("FirstOccurence"+"="+i);
                break;
            }
        }
    }
}