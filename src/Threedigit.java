import java.util.*;
public class Threedigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        if((num>=100) && (num<=999)){
            System.out.println("3 digit");
        }
        else{
            System.out.println("Not a 3 digit");
        }
    }
}