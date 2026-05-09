public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,5,6,7,,10};
        int max=0;
        int secondMax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                secondMax=max;
                max=i;
            }
            else if(arr[i]>arr[secondMax] && arr[i]!=arr[max]){
                secondMax=i;
            }
        }
        System.out.println("The second largest element in the array is: " + arr[secondMax]);
    }
}