import java.util.*;
public class Largestdigitinanumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = 0;
        while (n != 0) {
            int dig = n % 10;
            if (dig > max) {
                max = dig;
            }
            n /= 10;
        }
        System.out.println("The Largest number is:" + max);
    }
}