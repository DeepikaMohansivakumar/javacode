import java.util.*;
public class Countdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number to check:");
        int num = sc.nextInt();
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("The total no of digits are:"+count);
    }
}