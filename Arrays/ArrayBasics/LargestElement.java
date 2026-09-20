public class LargestElement{
    public static void main(String args[]){
        int[] arr = {10,40,20,33};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print("LargestElement"+"="+max);
    }
}