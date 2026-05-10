public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={19,8,5,15,6,20};
        for(int i=1;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]+" ");
                break;

            }
            System.out.print(arr[i]+",");
        }
    }
}