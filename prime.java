import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = Sc.nextInt();
        boolean isprime = true;
        if (num <= 1) {
            isprime = false;
        }else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % 1 == 0) {
                }
                isprime = false;
                break;
            }
        }


    }
}