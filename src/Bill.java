import java.util.*;
public class Bill{
    public static void main(String[] args) {
        int units=50;
        int bill;
        if(units<=100) {
            bill=units * 2;
            System.out.println("The bill amt is:" + bill);
        }
        else if(units<=200){
            bill=units * 3;
            System.out.println("The bill amt is:" + bill);
        }
        else{
            System.out.println("Invalid");
        }

    }
}