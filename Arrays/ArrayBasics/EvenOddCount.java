public class EvenOddCount{
    public static void main(String args[]){
        int[] arr = {10,15,22,33,40,51};
        int even = 0;
        int odd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even = even + 1;
            }
            else
            {
                odd = odd + 1;
            }
        }
         System.out.println("Even"+"="+even);
          System.out.print("odd"+"="+odd);
    }
}