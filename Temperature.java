import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in celsius~~");
        int Temperature = sc.nextInt();
        if(Temperature<=20)
        {
            System.out.println("Its coldddd");
        }
        else if((Temperature>20)&&(Temperature<=30))
        {
            System.out.println("Its Normalll");
        }
        else
        {
            System.out.println("Its hottttt");
        }
    }
}