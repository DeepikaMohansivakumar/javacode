import java.util.*;
public class LargestElemment{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[]=new int[size];
    int max=0;
    for(int i=0;i<size;i++){
        System.out.print("Enter element "+ i +": ");
        arr[i]=sc.nextInt();
    }
    for(int j=0;j<size;j++){
        if(arr[j]>arr[max]){
            max=j;
        }
    }
    System.out.println("The largest element in the array is: " + arr[max]);

    sc.close();
}

