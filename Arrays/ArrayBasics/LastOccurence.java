public class LastOccurence{
    public static void main(String[] args){
        int[] arr = {10,20,30,20,40,20};
        int target = 20;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                System.out.print("LastOccurence"+"="+i);
            break;
            }
        }
    }
}