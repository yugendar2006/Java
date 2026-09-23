public class CheckSorted {
    public static void main(String args[]){
        int[] arr = {10,30,20,40,50};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                System.out.println("Array is Sorted");
                break;
            }
            else{
                System.out.println("Array is not Sorted");
            }
        }
    }
}

