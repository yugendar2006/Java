public class SmallestElement {
    public static void main(String args[])
    {
        int[] arr = {25,10,45,5,30,15};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
            min = arr[i];
            }
        }
        System.out.print("SmallestElement"+"="+min);
    }
}
