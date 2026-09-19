public class CountPositiveNegativeZero{
    public static void main(String args[]) {
        int[] arr = {10,20,0,-5,1,0,-8};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>0){
               positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Positive"+"="+positive);
        System.out.println("Negative"+"="+negative);
        System.out.println("Zero"+"="+zero);
    }
}