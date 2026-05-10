import java.util.*;

public class Arrayeven {
    public static void main(String[] args){
        int arr[] = {1, 2, 8, 13, 15};
        int arreven = 0;
        int arrodd = 0;

        for(int i = 0; i < arr.length; i++){
            if((arr[i] % 2) == 0){
                arreven++;
            } else {
                arrodd++;
            }
        }

        if(arreven != 0){
            System.out.println("There is even found here : "+arreven);
        } else {
            System.out.println("Only odds are available : "+arrodd);
        }
    }
}